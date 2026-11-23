package irvine.math.turing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiPredicate;

/** Exact one-parameter tape rewrites. Lengths mean a*k+b for every k >= 0. */
final class AffineTape {

  static final int HALT = 'Z' - 'A';
  static final Length ZERO = new Length(0, 0);
  static final Length ONE = new Length(0, 1);

  static final class Length {
    final int mSlope;
    final int mOffset;

    Length(final int a, final int b) {
      mSlope = a;
      mOffset = b;
    }

    Length add(final Length t) {
      return new Length(Math.addExact(mSlope, t.mSlope), Math.addExact(mOffset, t.mOffset));
    }

    Length add(final int b) {
      return new Length(mSlope, Math.addExact(mOffset, b));
    }

    Length times(final int n) {
      return new Length(Math.multiplyExact(mSlope, n), Math.multiplyExact(mOffset, n));
    }

    boolean atLeast(final Length t) {
      return mSlope >= t.mSlope && mOffset >= t.mOffset;
    }

    @Override
    public boolean equals(final Object o) {
      return o instanceof Length && ((Length) o).mSlope == mSlope && ((Length) o).mOffset == mOffset;
    }

    @Override
    public int hashCode() {
      return 31 * mSlope + mOffset;
    }

    @Override
    public String toString() {
      return mSlope + "*k+" + mOffset;
    }
  }

  static final class Block {
    final String mWord;
    final Length mCount;

    Block(final String word, final Length count) {
      mWord = word;
      mCount = count;
    }
  }

  static final class Rule {
    final int mState;
    final int mMove;
    final char mWrite;

    private Rule(final String token) {
      mWrite = token.charAt(0);
      mMove = token.charAt(1) == 'R' ? 1 : -1;
      mState = token.charAt(2) - 'A';
    }
  }

  static Rule[][] rules(final String word) {
    final String[] rows = word.split("_", -1);
    final int symbols = rows[0].length() / 3;
    final Rule[][] rules = new Rule[rows.length][symbols];
    for (int q = 0; q < rows.length; ++q) {
      require(rows[q].length() == 3 * symbols, "Invalid machine row");
      for (int a = 0; a < symbols; ++a) {
        final String entry = rows[q].substring(3 * a, 3 * a + 3);
        if (!"---".equals(entry)) {
          require(entry.charAt(0) >= '0' && entry.charAt(0) < '0' + symbols
            && (entry.charAt(1) == 'L' || entry.charAt(1) == 'R')
            && (entry.charAt(2) >= 'A' && entry.charAt(2) < 'A' + rows.length || entry.charAt(2) == 'Z'), "Invalid rule");
          rules[q][a] = new Rule(entry);
        }
      }
    }
    return rules;
  }

  static void require(final boolean test, final String message) {
    if (!test) {
      throw new IllegalStateException(message);
    }
  }

  static void push(final List<Block> side, final String word, final Length count) {
    if (word.isEmpty() || ZERO.equals(count)) {
      return;
    }
    require(count.atLeast(ZERO), "Negative tape count");
    for (int n = 1; n <= word.length(); ++n) {
      final int repeats = word.length() / n;
      final String root = word.substring(0, n);
      if (n * repeats != word.length() || !root.repeat(repeats).equals(word)) {
        continue;
      }
      final Length c = count.times(repeats);
      if (!side.isEmpty() && side.get(0).mWord.equals(root)) {
        side.set(0, new Block(root, side.get(0).mCount.add(c)));
      } else if (!side.isEmpty() || !"0".equals(root)) {
        side.add(0, new Block(root, c));
      }
      return;
    }
    throw new IllegalStateException("No primitive root");
  }

  static char unpack(final List<Block> side) {
    if (side.isEmpty()) {
      return '0';
    }
    final Block b = side.remove(0);
    require(b.mCount.mOffset > 0, "Possibly empty tape block");
    push(side, b.mWord, b.mCount.add(-1));
    push(side, b.mWord.substring(1), ONE);
    return b.mWord.charAt(0);
  }

  private static int gcd(final int a, final int b) {
    return b == 0 ? a : gcd(b, a % b);
  }

  private static List<Block> cells(final List<Block> blocks) {
    final List<Block> out = new ArrayList<>();
    for (final Block b : blocks) {
      out.add(new Block(b.mWord, b.mCount.times(b.mWord.length())));
    }
    return out;
  }

  private static boolean allBlank(final List<Block> tape) {
    return tape.stream().allMatch(b -> b.mWord.chars().allMatch(c -> c == '0'));
  }

  private static void trim(final List<Block> cells, final Length done) {
    final Block b = cells.get(0);
    if (b.mCount.equals(done)) {
      cells.remove(0);
    } else {
      final int size = b.mWord.length();
      require(done.mSlope % size == 0, "Case-dependent periodic shift");
      final int skip = done.mOffset % size;
      cells.set(0, new Block(b.mWord.substring(skip) + b.mWord.substring(0, skip), b.mCount.add(done.times(-1))));
    }
  }

  private static boolean same(final List<Block> first, final List<Block> second) {
    final List<Block> xs = cells(first);
    final List<Block> ys = cells(second);
    while (!xs.isEmpty() && !ys.isEmpty()) {
      final Block a = xs.get(0);
      final Block b = ys.get(0);
      final Length min;
      if (a.mCount.atLeast(b.mCount)) {
        min = b.mCount;
      } else {
        require(b.mCount.atLeast(a.mCount), "Case-dependent tape comparison");
        min = a.mCount;
      }
      final int p = a.mWord.length(), q = b.mWord.length();
      final int cycle = Math.multiplyExact(p / gcd(p, q), q);
      final int size = min.mSlope == 0 ? Math.min(cycle, min.mOffset) : cycle;
      for (int j = 0; j < size; ++j) {
        if (a.mWord.charAt(j % p) != b.mWord.charAt(j % q)) {
          return false;
        }
      }
      trim(xs, min);
      trim(ys, min);
    }
    return allBlank(xs) && allBlank(ys);
  }

  private static final class Crossing {
    private final int mState;
    private final String mWord;
    private final int mSteps;

    private Crossing(final int state, final char[] symbols, final int steps) {
      mState = state;
      mWord = new String(symbols);
      mSteps = steps;
    }
  }

  private Crossing crosses(final String word, final int direction) {
    final char[] tape = word.toCharArray();
    int at = 0;
    int state = mState;
    final Set<String> seen = new HashSet<>();
    while (at >= 0 && at < tape.length) {
      final int a = tape[at] - '0';
      if (state >= mTable.length || a < 0 || a >= mTable[state].length || mTable[state][a] == null
        || !seen.add(state + ":" + at + ":" + new String(tape))) {
        return null;
      }
      final Rule r = mTable[state][a];
      tape[at] = r.mWrite;
      at += direction * r.mMove;
      state = r.mState;
    }
    return at == tape.length ? new Crossing(state, tape, seen.size()) : null;
  }

  private final Rule[][] mTable;
  int mState;
  char mHead;
  final List<Block> mLeft = new ArrayList<>();
  final List<Block> mRight = new ArrayList<>();
  Length mSteps = ZERO;

  AffineTape(final Rule[][] table, final int state, final char head, final List<Block> left, final List<Block> right) {
    mTable = table;
    mState = state;
    mHead = head;
    load(mLeft, left);
    load(mRight, right);
  }

  private static void load(final List<Block> target, final List<Block> raw) {
    for (int j = raw.size() - 1; j >= 0; --j) {
      final Block b = raw.get(j);
      push(target, b.mWord, b.mCount);
    }
  }

  void step() {
    final int read = mHead - '0';
    require(mState < mTable.length && read >= 0 && read < mTable[mState].length, "Read outside proof window or after halt");
    final Rule r = mTable[mState][read];
    require(r != null, "Undefined transition");
    push(r.mMove > 0 ? mLeft : mRight, String.valueOf(r.mWrite), ONE);
    mHead = unpack(r.mMove > 0 ? mRight : mLeft);
    mState = r.mState;
    mSteps = mSteps.add(ONE);
  }

  private boolean sweep(final List<Block> from, final List<Block> to, final int direction, final Length goal) {
    if (from.isEmpty()) {
      return false;
    }
    final Block first = from.get(0);
    final String word = first.mWord;
    if (mHead != word.charAt(word.length() - 1)) {
      return false;
    }
    for (int k = 1; k <= 4; ++k) {
      final Length n = first.mCount;
      final Length count = new Length(n.mSlope / k, n.mOffset / k);
      if (n.mSlope % k != 0 || count.mOffset < 1 || count.mSlope == 0 && count.mOffset < 2) {
        continue;
      }
      final Crossing c = crosses((mHead + word.substring(0, word.length() - 1)).repeat(k), direction);
      if (c == null || c.mState != mState) {
        continue;
      }
      final Length finish = mSteps.add(count.times(c.mSteps));
      if (goal.atLeast(finish)) {
        from.remove(0);
        push(from, word, new Length(0, n.mOffset % k));
        push(to, new StringBuilder(c.mWord).reverse().toString(), count);
        mSteps = finish;
        return true;
      }
    }
    return false;
  }

  void run(final Length goal, final BiPredicate<AffineTape, Length> checkedMacro) {
    for (int j = 0; j < 1000; ++j) {
      if (mSteps.equals(goal)) {
        return;
      }
      if (!(sweep(mRight, mLeft, 1, goal) || sweep(mLeft, mRight, -1, goal) || checkedMacro.test(this, goal))) {
        require(goal.atLeast(mSteps.add(ONE)), "Case-dependent step count");
        step();
      }
    }
    throw new IllegalStateException("Incomplete compressed trace");
  }

  boolean agrees(final AffineTape target) {
    return mState == target.mState && mHead == target.mHead && same(mLeft, target.mLeft) && same(mRight, target.mRight);
  }
}
