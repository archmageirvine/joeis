package irvine.math.turing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Exact one-step inductions for the cubic-finned machines (BusyCoq/Finned1.v to Finned5.v).
 * @author Gregory Morse
 */
final class FinnedMachines {
  private static final Expr ZERO = new Expr(0, 0, 0, 0, 0);
  private static final Expr ONE = new Expr(0, 0, 0, 0, 1);
  private static final Expr A = new Expr(1, 0, 0, 0, 0);
  private static final Expr B = new Expr(0, 1, 0, 0, 0);
  private static final Expr C = new Expr(0, 0, 1, 0, 0);
  private static final Expr D = new Expr(0, 0, 0, 1, 0);
  private static final Expr TWO_A = A.times(2);

  private FinnedMachines() { }

  private static final class Expr {
    private final int[] mValue;

    private Expr(final int... value) {
      this.mValue = value;
    }

    private Expr plus(final Expr rhs) {
      final int[] result = mValue.clone();
      for (int i = 0; i < result.length; ++i) {
        result[i] += rhs.mValue[i];
      }
      return new Expr(result);
    }

    private Expr times(final int multiplier) {
      final int[] result = mValue.clone();
      for (int i = 0; i < result.length; ++i) {
        result[i] *= multiplier;
      }
      return new Expr(result);
    }

    private Expr minus(final Expr rhs) {
      return plus(rhs.times(-1));
    }

    private Expr substitute(final Expr[] args) {
      Expr result = ONE.times(mValue[4]);
      for (int i = 0; i < 4; ++i) {
        result = result.plus(args[i].times(mValue[i]));
      }
      return result;
    }
  }

  private static final class Domain {
    private final Expr[] mCoordinates = new Expr[4];
    private final Expr mEquation;
    private final boolean mEmpty;

    private Domain(final Expr constraint, int branch) {
      for (int i = 0; i < 4; ++i, branch /= 3) {
        final int lower = branch % 3;
        final int[] data = new int[5];
        data[4] = lower;
        data[i] = lower == 2 ? 1 : 0;
        mCoordinates[i] = new Expr(data);
      }
      final int[] reduced = constraint.substitute(mCoordinates).mValue;
      int gcd = 0;
      boolean allPos = true;
      boolean allNeg = true;
      for (int i = 0; i < 4; ++i) {
        allPos &= reduced[i] >= 0;
        allNeg &= reduced[i] <= 0;
        gcd = gcd(gcd, Math.abs(reduced[i]));
      }
      mEmpty = allPos && reduced[4] > 0 || allNeg && reduced[4] < 0
        || gcd != 0 && reduced[4] % gcd != 0;
      if ((allPos || allNeg) && reduced[4] == 0) {
        for (int i = 0; i < 4; ++i) {
          if (reduced[i] != 0) {
            mCoordinates[i] = ONE.times(mCoordinates[i].mValue[4]);
          }
        }
      }
      mEquation = constraint.substitute(mCoordinates);
    }

    private static int gcd(final int a, final int b) {
      return b == 0 ? a : gcd(b, a % b);
    }

    private boolean zero(final Expr expression) {
      final int[] left = expression.substitute(mCoordinates).mValue;
      if (Arrays.equals(left, ZERO.mValue)) {
        return true;
      }
      final int[] right = mEquation.mValue;
      for (int k = 0; k < right.length; ++k) {
        if (right[k] != 0) {
          for (int i = 0; i < left.length; ++i) {
            if ((long) left[i] * right[k] != (long) left[k] * right[i]) {
              return false;
            }
          }
          return true;
        }
      }
      return false;
    }

    private boolean atLeast(final Expr expression, final int n) {
      final int[] reduced = expression.substitute(mCoordinates).mValue;
      return reduced[4] >= n && reduced[0] >= 0 && reduced[1] >= 0 && reduced[2] >= 0 && reduced[3] >= 0;
    }
  }

  private static final class Run {
    private final String mBlock;
    private final Expr mCount;

    private Run(final String block, final Expr count) {
      this.mBlock = block;
      this.mCount = count;
    }
  }

  private static final class Tape {
    private final int mState;
    private final int mHead;
    private final List<Run> mL;
    private final List<Run> mR;

    private Tape(final int state, final int head, final List<Run> l, final List<Run> r) {
      this.mState = state;
      this.mHead = head;
      this.mL = l;
      this.mR = r;
    }
  }

  private static List<Run> side(final Expr... repeats) {
    final List<Run> result = new ArrayList<>();
    for (int i = 0; i < repeats.length; ++i) {
      result.add(new Run(i == 1 ? "0" : "1", repeats[i]));
    }
    return result;
  }

  private static List<Run> right(final String tail, final Expr repeats, final Expr... ones) {
    final List<Run> result = new ArrayList<>();
    for (final Expr n : ones) {
      result.add(new Run("1", n));
    }
    result.add(new Run(tail, repeats));
    return result;
  }

  private static Tape template(final int family, final int id, final Expr a, final Expr b, final Expr c, final Expr d) {
    if (family != 3) {
      return otherTemplate(family, id, a, b, c, d);
    }
    switch (id) {
      case 0: return new Tape(1, 0, side(b, ONE, a), List.of());
      case 1: return new Tape(2, 0, side(b, ONE, a), List.of());
      case 2: return new Tape(0, 1, side(b, ONE, a), right("01", d));
      case 3: return new Tape(4, 1, side(b, ONE, a), right("01", d, ONE));
      case 4: return new Tape(0, 0, side(a), right("01", d));
      case 5: return new Tape(1, 1, side(b, ONE, a), right("01", d, c));
      case 6: return new Tape(1, 0, side(a), right("01", d, ONE, c));
      case 7: return new Tape(2, 1, side(a.plus(ONE)), right("01", d, c));
      case 8: return new Tape(3, 1, side(b, ONE, a), right("01", d, c));
      case 9: return new Tape(3, 0, side(b, ONE, a), right("10", d));
      default: throw new IllegalArgumentException();
    }
  }

  private static Tape otherTemplate(final int family, final int id, final Expr a, final Expr b, final Expr c, final Expr d) {
    final List<Run> split = side(b, ONE, a);
    final List<Run> ones = side(a);
    final List<Run> plus = side(a.plus(ONE));
    final List<Run> empty = List.of();
    final List<Run> pairs = right("01", d);
    final List<Run> otherPairs = right("10", d);
    final List<Run> tail = right("01", d, c);
    final List<Run> headed = right("01", d, ONE);
    final List<Run> headedTail = right("01", d, ONE, c);
    if (family == 1) {
      switch (id) {
        case 0: return new Tape(0, 0, split, tail);
        case 1: return new Tape(1, 0, split, otherPairs);
        case 2: return new Tape(2, 1, split, tail);
        case 3: return new Tape(2, 0, ones, headedTail);
        case 4: return new Tape(3, 1, plus, tail);
        case 5: return new Tape(1, 1, split, tail);
        case 6: return new Tape(2, 0, split, empty);
        case 7: return new Tape(3, 0, split, empty);
        case 8: return new Tape(4, 1, split, pairs);
        case 9: return new Tape(0, 1, split, headed);
        default: throw new IllegalArgumentException();
      }
    } else if (family == 2) {
      switch (id) {
        case 0: return new Tape(0, 0, split, otherPairs);
        case 1: return new Tape(1, 1, split, tail);
        case 2: return new Tape(1, 0, ones, headedTail);
        case 3: return new Tape(2, 1, plus, tail);
        case 4: return new Tape(0, 1, split, tail);
        case 5: return new Tape(1, 0, split, empty);
        case 6: return new Tape(2, 0, split, empty);
        case 7: return new Tape(3, 1, split, pairs);
        case 8: return new Tape(4, 1, split, headed);
        case 9: return new Tape(3, 0, ones, pairs);
        default: throw new IllegalArgumentException();
      }
    }
    switch (id) {
      case 0: return new Tape(0, 0, split, empty);
      case 1: return new Tape(1, 0, split, empty);
      case 2: return new Tape(2, 1, split, pairs);
      case 3: return new Tape(3, 1, split, headed);
      case 4: return new Tape(3, 0, ones, headed);
      case 5: return new Tape(0, 1, split, tail);
      case 6: return new Tape(0, 0, ones, headedTail);
      case 7: return new Tape(1, 1, plus, tail);
      case 8: return new Tape(4, 1, split, tail);
      case 9: return new Tape(4, 0, split, otherPairs);
      default: throw new IllegalArgumentException();
    }
  }

  private static Expr constraint(final int family, final int id) {
    final Expr balanced = TWO_A.plus(D).minus(B).minus(C);
    final Expr even = TWO_A.minus(B).minus(D.times(2));
    final Expr two = ONE.times(2);
    final Expr three = ONE.times(3);
    if (family == 1) {
      return new Expr[] {balanced, TWO_A.plus(D).plus(ONE).minus(B), balanced.plus(three),
        TWO_A.plus(D).plus(three).minus(C), TWO_A.plus(D).plus(three).minus(C), balanced,
        TWO_A.plus(two).minus(B), TWO_A.plus(three).minus(B), even.plus(two), even.plus(ONE)}[id];
    } else if (family == 2) {
      return new Expr[] {TWO_A.plus(D).minus(B), balanced.plus(two), TWO_A.plus(D).plus(two).minus(C),
        TWO_A.plus(D).plus(two).minus(C), balanced.minus(ONE), TWO_A.plus(ONE).minus(B),
        TWO_A.plus(two).minus(B), even.plus(ONE), even, TWO_A.plus(two).minus(D.times(2))}[id];
    } else if (family >= 4) {
      return new Expr[] {TWO_A.minus(B), TWO_A.plus(ONE).minus(B), even, even.minus(ONE), A.minus(D),
        balanced.plus(ONE), TWO_A.plus(D).plus(ONE).minus(C), TWO_A.plus(D).plus(ONE).minus(C),
        balanced.minus(two), TWO_A.plus(D).minus(B).minus(ONE)}[id];
    }
    switch (id) {
      case 0: return TWO_A.minus(B).minus(ONE);
      case 1: return TWO_A.minus(B);
      case 2: return TWO_A.minus(B).minus(D.times(2)).minus(ONE);
      case 3: return TWO_A.minus(B).minus(D.times(2)).minus(ONE.times(2));
      case 4: return A.minus(D);
      case 5: return TWO_A.plus(D).minus(B).minus(C);
      case 6:
      case 7: return TWO_A.plus(D).minus(C);
      case 8: return TWO_A.plus(D).minus(B).minus(C).minus(ONE.times(3));
      case 9: return TWO_A.plus(D).minus(B).minus(ONE.times(2));
      default: throw new IllegalArgumentException();
    }
  }

  private static final class Jump {
    private final int mTarget;
    private final Expr[] mArgs;

    private Jump(final int target, final Expr... args) {
      this.mTarget = target;
      this.mArgs = args;
    }
  }

  private static Jump successor(final int family, final int id, final Domain dom) {
    final Expr bp = B.plus(ONE);
    final Expr bm = B.minus(ONE);
    final Expr cp = C.plus(ONE);
    final Expr cm = C.minus(ONE);
    final Expr dp = D.plus(ONE);
    final Expr dm = D.minus(ONE);
    final Expr ap = A.plus(ONE);
    final Expr am = A.minus(ONE);
    if (family == 1) {
      switch (id) {
        case 0: return dom.zero(C) ? new Jump(1, A, bp, ZERO, D) : new Jump(5, A, bp, cm, D);
        case 1: return dom.zero(D) ? new Jump(6, A, bp, ZERO, ZERO) : new Jump(2, A, bp, ZERO, dm);
        case 2: return dom.zero(B) ? new Jump(3, A, ZERO, C, D) : new Jump(2, A, bm, cp, D);
        case 3: return new Jump(4, A, ZERO, C, D);
        case 4: return new Jump(5, ap, ZERO, cm, D);
        case 5: return dom.zero(C) ? new Jump(1, A, bp, ZERO, D) : new Jump(5, A, bp, cm, D);
        case 6: return new Jump(7, A, bp, ZERO, ZERO);
        case 7: return new Jump(8, A, bm, ZERO, ZERO);
        case 8: return dom.zero(B) ? new Jump(0, ZERO, A, ONE, D) : new Jump(9, A, bm, ZERO, D);
        case 9: return new Jump(8, A, bm, ZERO, dp);
        default: throw new IllegalArgumentException();
      }
    } else if (family == 2) {
      switch (id) {
        case 0: return dom.zero(D) ? new Jump(5, A, bp, ZERO, ZERO) : new Jump(1, A, bp, ZERO, dm);
        case 1: return dom.zero(B) ? new Jump(2, A, ZERO, C, D) : new Jump(1, A, bm, cp, D);
        case 2: return new Jump(3, A, ZERO, C, D);
        case 3: return new Jump(4, ap, ZERO, cm, D);
        case 4: return dom.zero(C) ? new Jump(0, A, bp, ZERO, D) : new Jump(4, A, bp, cm, D);
        case 5: return new Jump(6, A, bp, ZERO, ZERO);
        case 6: return new Jump(7, A, bm, ZERO, ZERO);
        case 7: return new Jump(8, A, bm, ZERO, D);
        case 8: return dom.zero(B) ? new Jump(9, A, ZERO, ZERO, dp) : new Jump(7, A, bm, ZERO, dp);
        case 9: return new Jump(0, ZERO, ap, ZERO, D);
        default: throw new IllegalArgumentException();
      }
    } else if (family >= 4) {
      switch (id) {
        case 0: return new Jump(1, A, bp, ZERO, ZERO);
        case 1: return new Jump(2, A, bm, ZERO, ZERO);
        case 2: return dom.zero(B) ? new Jump(4, A, ZERO, ZERO, D) : new Jump(3, A, bm, ZERO, D);
        case 3: return new Jump(2, A, bm, ZERO, dp);
        case 4: return family == 4 ? new Jump(5, ZERO, ap, ZERO, D) : dom.zero(A)
          ? new Jump(6, ZERO, ZERO, ONE, ZERO) : new Jump(5, ZERO, am, ONE.times(2), D);
        case 5: return dom.zero(B) ? new Jump(6, A, ZERO, C, D) : new Jump(5, A, bm, cp, D);
        case 6: return new Jump(7, A, ZERO, C, D);
        case 7: return new Jump(8, ap, ZERO, cm, D);
        case 8: return dom.zero(C) ? new Jump(9, A, bp, ZERO, D) : new Jump(8, A, bp, cm, D);
        case 9: return dom.zero(D) ? new Jump(0, A, bp, ZERO, ZERO) : new Jump(5, A, bp, ZERO, dm);
        default: throw new IllegalArgumentException();
      }
    }
    switch (id) {
      case 0: return new Jump(1, A, bp, ZERO, ZERO);
      case 1: return dom.zero(B) ? new Jump(4, ZERO, ZERO, ZERO, ZERO) : new Jump(2, A, bm, ZERO, ZERO);
      case 2: return new Jump(3, A, bm, ZERO, D);
      case 3: return dom.zero(B) ? new Jump(4, A, ZERO, ZERO, dp) : new Jump(2, A, bm, ZERO, dp);
      case 4: return dom.zero(A) ? new Jump(6, ZERO, ZERO, ZERO, ZERO) : new Jump(5, ZERO, A.minus(ONE), ONE, D);
      case 5: return dom.zero(B) ? new Jump(6, A, ZERO, C, D) : new Jump(5, A, bm, cp, D);
      case 6: return new Jump(7, A, ZERO, C, D);
      case 7: return dom.zero(C) ? new Jump(9, ONE, ZERO, ZERO, ZERO) : new Jump(8, A.plus(ONE), ZERO, cm, D);
      case 8: return dom.zero(C) ? new Jump(9, A, bp, ZERO, D) : new Jump(8, A, bp, cm, D);
      case 9: return dom.zero(D) ? new Jump(0, A, bp, ZERO, ZERO) : new Jump(5, A, bp, ZERO, D.minus(ONE));
      default: throw new IllegalArgumentException();
    }
  }

  private static Tape step(final Tape tape, final int[] rules, final Domain dom) {
    final int rule = rules[2 * tape.mState + tape.mHead];
    if (rule < 0) {
      throw new IllegalStateException("Halting branch in symbolic invariant");
    }
    final boolean movesRight = (rule & 1) != 0;
    final List<Run> pop = new ArrayList<>(movesRight ? tape.mR : tape.mL);
    final List<Run> push = new ArrayList<>(movesRight ? tape.mL : tape.mR);
    push.add(0, new Run((rule & 2) == 0 ? "0" : "1", ONE));
    int head = 0;
    while (!pop.isEmpty()) {
      final Run run = pop.remove(0);
      if (!dom.zero(run.mCount)) {
        if (!dom.atLeast(run.mCount, 1)) {
          throw new IllegalStateException("Ambiguous front run");
        }
        head = run.mBlock.charAt(0) - '0';
        pop.add(0, new Run(run.mBlock, run.mCount.minus(ONE)));
        if (run.mBlock.length() == 2) {
          pop.add(0, new Run(run.mBlock.substring(1), ONE));
        }
        break;
      }
    }
    return new Tape(rule >>> 2, head, movesRight ? push : pop, movesRight ? pop : push);
  }

  private static void append(final List<Run> list, final String bit, final Expr length, final Domain dom) {
    if (!dom.zero(length)) {
      final int i = list.size() - 1;
      if (i >= 0 && list.get(i).mBlock.equals(bit)) {
        list.set(i, new Run(bit, length.plus(list.get(i).mCount)));
      } else {
        list.add(new Run(bit, length));
      }
    }
  }

  /** Binary half-tapes with a blank tail are equal iff their difference words agree. */
  private static List<Run> differences(final List<Run> input, final Domain dom) {
    final List<Run> result = new ArrayList<>();
    char last = '\0';
    for (final Run run : input) {
      if (dom.zero(run.mCount)) {
        continue;
      }
      if (!dom.atLeast(run.mCount, 1)) {
        throw new IllegalStateException("Ambiguous or negative match run");
      }
      final char next = run.mBlock.charAt(0);
      if (last != '\0') {
        append(result, last == next ? "0" : "1", ONE, dom);
      }
      append(result, run.mBlock.length() == 1 ? "0" : "1", run.mCount.times(run.mBlock.length()).minus(ONE), dom);
      last = run.mBlock.charAt(run.mBlock.length() - 1);
    }
    if (last == '1') {
      append(result, "1", ONE, dom);
    } else if (!result.isEmpty() && result.get(result.size() - 1).mBlock.equals("0")) {
      result.remove(result.size() - 1);
    }
    return result;
  }

  private static boolean same(final List<Run> a, final List<Run> b, final Domain dom) {
    final List<Run> x = differences(a, dom);
    final List<Run> y = differences(b, dom);
    if (x.size() != y.size()) {
      return false;
    }
    for (int i = 0; i < x.size(); ++i) {
      if (!x.get(i).mBlock.equals(y.get(i).mBlock) || !dom.zero(x.get(i).mCount.minus(y.get(i).mCount))) {
        return false;
      }
    }
    return true;
  }

  private static final int[][] MACHINES = {
    {7, 16, 11, 7, 15, 10, 16, 5, -1, 2},
    {7, 3, 11, 6, 12, 1, 3, 18, -1, 12},
    {6, 18, 11, 6, 0, 13, 7, 15, -1, 0},  // Reflected to match the published induction.
    {7, 2, 8, 17, -1, 14, 3, 8, 3, 19},
    {7, 2, 8, 17, -1, 14, 2, 8, 3, 19},
  };

  static boolean closes(final int[] machine) {
    if (machine.length != 10) {
      return false;
    }
    for (int family = 1; family <= MACHINES.length; ++family) {
      final int[] rules = MACHINES[family - 1];
      boolean matches = true;
      for (int i = 0; i < rules.length; ++i) {
        matches &= (machine[i] < 0 ? -1 : machine[i] ^ (family == 3 ? 1 : 0)) == rules[i];
      }
      if (matches) {
        return closes(family, rules);
      }
    }
    return false;
  }

  private static boolean closes(final int family, final int[] rules) {
    final int start = family == 3 ? 4 : 0;
    final Tape blank = template(family, start, ZERO, ZERO, ZERO, ZERO);
    final Domain base = new Domain(constraint(family, start), 0);
    if (blank.mState != 0 || blank.mHead != 0 || !same(blank.mL, List.of(), base) || !same(blank.mR, List.of(), base)
      || !base.zero(constraint(family, start).substitute(new Expr[] {ZERO, ZERO, ZERO, ZERO}))) {
      return false;
    }
    for (int id = 0; id < 10; ++id) {
      for (int branch = 0; branch < 81; ++branch) {
        final Domain dom = new Domain(constraint(family, id), branch);
        if (dom.mEmpty) {
          continue;
        }
        final Jump jump = successor(family, id, dom);
        final Expr[] args = jump.mArgs;
        for (final Expr arg : args) {
          if (!dom.atLeast(arg, 0)) {
            return false;
          }
        }
        final Tape after = step(template(family, id, A, B, C, D), rules, dom);
        final Tape target = template(family, jump.mTarget, args[0], args[1], args[2], args[3]);
        if (!dom.zero(constraint(family, jump.mTarget).substitute(args)) || after.mState != target.mState || after.mHead != target.mHead
          || !same(after.mL, target.mL, dom) || !same(after.mR, target.mR, dom)) {
          System.out.println("INCONCLUSIVE Finned #" + family + " template=" + id + " branch=" + branch);
          return false;
        }
      }
    }
    return true;
  }
}
