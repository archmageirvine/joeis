package irvine.math.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/**
 * Exhaustive search of small binary Post correspondence instances.
 * @author Gregory Morse
 */
public final class PcpBusyBeaver {
  private static final int UNKNOWN = -1;
  private static final int FRONTIER = 3000;
  private static final int REFINEMENT = 100_000;
  private static final int MAX_REMAINDER = 256;
  private static final int RAHN_HORIZON = 75;

  private final int mWidth;
  private final int mSearchHorizon;
  private final boolean mAssumeHorizon;
  private final String[] mWord;
  private final int[] mReverse;
  private final int mWords;
  private final int[] mChosen;
  private int mMaximum = 1;
  private int mUnknown;
  private Predicate<String> mNonhaltingCertificate = x -> false;

  private PcpBusyBeaver(final int width, final int searchHorizon, final boolean assumeHorizon) {
    mWidth = width;
    mSearchHorizon = searchHorizon;
    mAssumeHorizon = assumeHorizon;
    mWords = (2 << width) - 2;
    mWord = new String[mWords];
    mReverse = new int[mWords];
    mChosen = new int[width];
    for (int i = 0; i < mWords; ++i) {
      final String w = Integer.toBinaryString(i + 2).substring(1);
      mWord[i] = w;
      mReverse[i] = Integer.parseInt("1" + new StringBuilder(w).reverse(), 2) - 2;
    }
  }

  private static final class Tile {
    private final String mTop;
    private final String mBottom;
    private final int mZeros;
    private final int mOnes;

    private Tile(final String top, final String bottom) {
      mTop = top;
      mBottom = bottom;
      mZeros = ones(bottom) + top.length() - ones(top) - bottom.length();
      mOnes = ones(top) - ones(bottom);
    }

    private Tile reverse() {
      return new Tile(new StringBuilder(mTop).reverse().toString(), new StringBuilder(mBottom).reverse().toString());
    }

    @Override
    public String toString() {
      return mTop + "/" + mBottom;
    }
  }

  private static int ones(final String s) {
    int count = 0;
    for (int i = 0; i < s.length(); ++i) {
      count += s.charAt(i) == '1' ? 1 : 0;
    }
    return count;
  }

  private static int gcd(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    while (b != 0) {
      final int r = a % b;
      a = b;
      b = r;
    }
    return a;
  }

  private static int determinant(final int x, final int y, final int u, final int v) {
    return x * v - y * u;
  }

  private static final class Instance {
    private final List<Tile> mTiles;
    private final int mIndex;
    private final int mGcd;
    private final int mTopShrink;
    private final int mBottomShrink;

    private Instance(final List<Tile> tiles) {
      mTiles = tiles;
      int index = 0;
      int gcd = 0;
      int topShrink = 0;
      int bottomShrink = 0;
      for (final Tile t : tiles) {
        topShrink = Math.max(topShrink, t.mBottom.length() - t.mTop.length());
        bottomShrink = Math.max(bottomShrink, t.mTop.length() - t.mBottom.length());
        gcd = gcd(gcd, gcd(t.mZeros, t.mOnes));
        for (final Tile u : tiles) {
          index = gcd(index, determinant(t.mZeros, t.mOnes, u.mZeros, u.mOnes));
        }
      }
      mIndex = index;
      mGcd = gcd;
      mTopShrink = topShrink;
      mBottomShrink = bottomShrink;
    }

    private Instance reverse() {
      final List<Tile> reverse = new ArrayList<>();
      for (final Tile t : mTiles) {
        reverse.add(t.reverse());
      }
      return new Instance(reverse);
    }

    private boolean balances(final int x, final int y) {
      if (mGcd == 0) {
        return x == 0 && y == 0;
      }
      if (mIndex == 0 && (x % mGcd != 0 || y % mGcd != 0)) {
        return false;
      }
      for (final Tile t : mTiles) {
        final int d = determinant(x, y, t.mZeros, t.mOnes);
        if (mIndex == 0 ? d != 0 : d % mIndex != 0) {
          return false;
        }
      }
      // The desired change must also be in the nonnegative cone spanned
      // by the tile differences. In dimension two, two generators suffice.
      for (final Tile t : mTiles) {
        if (determinant(x, y, t.mZeros, t.mOnes) == 0 && x * t.mZeros + y * t.mOnes > 0) {
          return true;
        }
        for (final Tile u : mTiles) {
          final int d = determinant(t.mZeros, t.mOnes, u.mZeros, u.mOnes);
          if (d != 0 && d * determinant(x, y, u.mZeros, u.mOnes) >= 0
            && d * determinant(t.mZeros, t.mOnes, x, y) >= 0) {
            return true;
          }
        }
      }
      return x == 0 && y == 0;
    }

    private boolean canConsume(final String w, final boolean top) {
      final boolean[] reach = new boolean[w.length() + 1];
      reach[1] = true; // Character zero indicates which side is ahead.
      for (int i = 1; i < w.length(); ++i) {
        if (reach[i]) {
          for (final Tile t : mTiles) {
            final String s = top ? t.mBottom : t.mTop;
            final int size = Math.min(w.length() - i, s.length());
            if (w.regionMatches(i, s, 0, size)) {
              if (i + size == w.length()) {
                return true;
              }
              reach[i + size] = true;
            }
          }
        }
      }
      return false;
    }

    private boolean possible(final String remaining, final int mask) {
      final boolean top = remaining.charAt(0) == '+';
      if ((mask & (top ? 1 : 2)) != 0) {
        return false;
      }
      final int y = ones(remaining);
      final int x = remaining.length() - 1 - y;
      return balances(top ? -x : x, top ? -y : y) && canConsume(remaining, top);
    }

    private String successor(final String state, final Tile t) {
      final String tail = state.isEmpty() ? "" : state.substring(1);
      final String top = state.startsWith("+") ? tail + t.mTop : t.mTop;
      final String bottom = state.startsWith("-") ? tail + t.mBottom : t.mBottom;
      if (top.equals(bottom)) {
        return "";
      }
      if (top.startsWith(bottom)) {
        return "+" + top.substring(bottom.length());
      }
      return bottom.startsWith(top) ? "-" + bottom.substring(top.length()) : null;
    }

    private boolean canDecrease(final String state) {
      final boolean top = state.charAt(0) == '+';
      final String residual = state.substring(1);
      for (final Tile candidate : mTiles) {
        final String across = top ? candidate.mBottom : candidate.mTop;
        final String append = top ? candidate.mTop : candidate.mBottom;
        if (across.length() <= append.length()) {
          continue;
        }
        if (residual.contains(across)) {
          return true;
        }
        final int width = across.length() - 1;
        final Set<String> suffixes = new HashSet<>();
        final ArrayDeque<String> pending = new ArrayDeque<>();
        final String first = residual.substring(Math.max(0, residual.length() - width));
        suffixes.add(first);
        pending.add(first);
        while (!pending.isEmpty()) {
          final String suffix = pending.removeFirst();
          // A matching word may extend into the tile being appended
          // only if the previous residual is shorter than that word.
          for (int k = residual.length(); k <= suffix.length(); ++k) {
            final String part = suffix.substring(suffix.length() - k) + append;
            if (part.startsWith(across) || across.startsWith(part)) {
              return true;
            }
          }
          for (final Tile t : mTiles) {
            final String word = top ? t.mTop : t.mBottom;
            if (word.length() < (top ? t.mBottom : t.mTop).length()) {
              continue; // Before the first decrease only these tiles can occur.
            }
            final String extended = suffix + word;
            if (extended.contains(across)) {
              return true;
            }
            final String last = extended.substring(Math.max(0, extended.length() - width));
            if (suffixes.add(last)) {
              pending.addLast(last);
            }
          }
        }
      }
      return false;
    }

    private int search(final String initial, final int mask, final int limit) {
      final ArrayDeque<String> queue = new ArrayDeque<>();
      final Set<String> seen = new HashSet<>();
      if (!initial.isEmpty() && !possible(initial, mask)) {
        return 0;
      }
      queue.add(initial);
      seen.add(initial);
      for (int distance = 1; !queue.isEmpty(); ++distance) {
        for (int layer = queue.size(); layer > 0; --layer) {
          final String state = queue.removeFirst();
          if (limit == REFINEMENT && !state.isEmpty() && !canDecrease(state)) {
            continue;
          }
          for (final Tile t : mTiles) {
            final String next = successor(state, t);
            if (next == null) {
              continue;
            }
            if (next.isEmpty()) {
              return distance;
            }
            if (seen.add(next) && possible(next, mask)) {
              if (seen.size() > limit || next.length() > MAX_REMAINDER) {
                return UNKNOWN;
              }
              queue.addLast(next);
            }
          }
        }
      }
      return 0;
    }

    private int mask(final Instance reversed) {
      int mask = 0;
      for (final boolean top : new boolean[] {true, false}) {
        boolean blocked = true;
        for (final Tile t : mTiles) {
          final String longWord = top ? t.mBottom : t.mTop;
          final String shortWord = top ? t.mTop : t.mBottom;
          // Every residual that reduces to empty or changes sides at
          // this tile is a short prefix of the opposing word.
          for (int i = 1; i <= longWord.length() - shortWord.length(); ++i) {
            if (longWord.startsWith(shortWord, i)) {
              final String prefix = longWord.substring(0, i);
              final String reverse = new StringBuilder(prefix).reverse().toString();
              // Generating this residual forward is equivalent to consuming
              // the reversed residual on the opposite side in reverse.
              if (reversed.search((top ? "-" : "+") + reverse, 0, 64) != 0
                && search((top ? "+" : "-") + prefix, 0, 64) != 0) {
                blocked = false;
              }
            }
          }
        }
        if (blocked) {
          mask |= top ? 1 : 2;
        }
      }
      return mask;
    }

    private static String cover(final String state, final int k) {
      return state.length() <= 2 * k ? state
        : state.substring(0, k + 1) + '/' + state.substring(state.length() - k);
    }

    private boolean enqueue(final String state, final int mask, final int k, final Instance reversed,
                            final Set<String> seen, final ArrayDeque<String> queue) {
      if (state.isEmpty()) {
        return false;
      }
      final boolean top = state.startsWith("+");
      if ((mask & (top ? 1 : 2)) != 0) {
        return true;
      }
      final String key = cover(state, k);
      if (seen.add(key)) {
        final int slash = key.indexOf('/');
        if (slash < 0 ? possible(key, mask)
          : canConsume(key.substring(0, slash), top)
          && reversed.canConsume((top ? "-" : "+") + new StringBuilder(key.substring(slash + 1)).reverse(), !top)) {
          queue.addLast(key);
        }
      }
      return true;
    }

    private boolean closesCover(final Instance reversed, final int k) {
      final Set<String> seen = new HashSet<>();
      final ArrayDeque<String> queue = new ArrayDeque<>();
      final int mask = mask(reversed);
      queue.add("");
      while (!queue.isEmpty()) {
        final String state = queue.removeFirst();
        final int slash = state.indexOf('/');
        for (final Tile tile : mTiles) {
          if (slash < 0) {
            final String next = successor(state, tile);
            if (next != null && !enqueue(next, mask, k, reversed, seen, queue)) {
              return false;
            }
          } else {
            final boolean top = state.startsWith("+");
            final String consume = top ? tile.mBottom : tile.mTop;
            final String append = top ? tile.mTop : tile.mBottom;
            if (!state.startsWith(consume, 1)) {
              continue;
            }
            final String prefix = state.substring(0, 1) + state.substring(consume.length() + 1, slash);
            final String suffix = state.substring(slash + 1) + append;
            // A long residual is prefix + arbitrary middle + suffix.
            // Once the middle fills out the resulting prefix, further
            // letters cannot change either stored end of the result.
            for (int len = 0; len <= consume.length(); ++len) {
              for (int bits = 0; bits < (1 << len); ++bits) {
                final String middle = Integer.toBinaryString((1 << len) | bits).substring(1);
                if (!enqueue(prefix + middle + suffix, mask, k, reversed, seen, queue)) {
                  return false;
                }
              }
            }
          }
        }
      }
      return true;
    }

    @Override
    public String toString() {
      return mTiles.toString();
    }

    private boolean canStart() {
      for (final Tile t : mTiles) {
        if (t.mTop.startsWith(t.mBottom) || t.mBottom.startsWith(t.mTop)) {
          return true;
        }
      }
      return false;
    }
  }

  private static final class Frontier {
    private final Instance mInstance;
    private final int mMask;
    private final Map<String, Integer> mSeen = new HashMap<>();
    private List<String> mLevel = List.of("");
    private int mDepth;

    private Frontier(final Instance instance, final int mask) {
      mInstance = instance;
      mMask = mask;
    }

    private int extend(final Frontier opposite, final int horizon, final BalanceDistance distances) {
      ++mDepth;
      int best = Integer.MAX_VALUE;
      final List<String> nextLevel = new ArrayList<>();
      for (final String word : mLevel) {
        if (!word.isEmpty() && !mInstance.canDecrease(word)) {
          continue;
        }
        for (final Tile tile : mInstance.mTiles) {
          final String next = mInstance.successor(word, tile);
          if (next == null) {
            continue;
          }
          if (next.isEmpty()) {
            best = Math.min(best, mDepth);
          } else if (next.length() - 1 <= (long) (horizon - mDepth)
            * (next.startsWith("+") ? mInstance.mTopShrink : mInstance.mBottomShrink)
            && (distances == null || distances.couldClose(next, horizon - mDepth))
            && !mSeen.containsKey(next) && mInstance.possible(next, mMask)) {
            if (mSeen.size() >= (distances == null ? REFINEMENT : 1_000_000) || next.length() > MAX_REMAINDER) {
              return UNKNOWN;
            }
            final String reversed = (next.startsWith("+") ? "-" : "+") + new StringBuilder(next.substring(1)).reverse();
            final Integer distance = opposite.mSeen.get(reversed);
            if (distance != null) {
              best = Math.min(best, mDepth + distance);
            }
            mSeen.put(next, mDepth);
            nextLevel.add(next);
          }
        }
      }
      mLevel = nextLevel;
      return best;
    }
  }

  private static int meet(final Instance forward, final Instance backward) {
    return meet(forward, backward, Integer.MAX_VALUE);
  }

  private static int meet(final Instance forward, final Instance backward, final int horizon) {
    return meet(forward, backward, horizon, null);
  }

  private static int meet(final Instance forward, final Instance backward, final int horizon, final BalanceDistance distances) {
    final Frontier left = new Frontier(forward, forward.mask(backward));
    final Frontier right = new Frontier(backward, backward.mask(forward));
    while (!left.mLevel.isEmpty() && !right.mLevel.isEmpty() && left.mDepth + right.mDepth < horizon) {
      final int result = left.mLevel.size() <= right.mLevel.size()
        ? left.extend(right, horizon, distances) : right.extend(left, horizon, distances);
      if (result != Integer.MAX_VALUE) {
        return result;
      }
    }
    return 0;
  }

  private static final class BalanceDistance {
    private final int mRadius;
    private final int mStride;
    private final int[] mDistances;

    private BalanceDistance(final Instance instance, final int depth) {
      mRadius = 3 * depth;
      mStride = 2 * mRadius + 1;
      mDistances = new int[mStride * mStride];
      Arrays.fill(mDistances, -1);
      final int[] pending = new int[mDistances.length];
      pending[0] = mRadius * mStride + mRadius;
      mDistances[pending[0]] = 0;
      int end = 1;
      for (int at = 0; at < end; ++at) {
        final int x = pending[at] / mStride;
        final int y = pending[at] % mStride;
        final int d = mDistances[pending[at]] + 1;
        if (d <= depth) {
          for (final Tile tile : instance.mTiles) {
            final int index = (x + tile.mZeros) * mStride + y + tile.mOnes;
            if (mDistances[index] < 0) {
              mDistances[index] = d;
              pending[end++] = index;
            }
          }
        }
      }
    }

    private boolean couldClose(final String word, final int budget) {
      final int sign = word.startsWith("+") ? -1 : 1;
      final int ones = ones(word);
      final int x = sign * (word.length() - 1 - ones);
      final int y = sign * ones;
      if (Math.abs(x) > mRadius || Math.abs(y) > mRadius) {
        return false;
      }
      final int distance = mDistances[(x + mRadius) * mStride + y + mRadius];
      return distance >= 0 && distance <= budget;
    }
  }

  private boolean representative(final int used) {
    final int[] copy = new int[used];
    for (int symmetry = 1; symmetry < 8; ++symmetry) {
      for (int i = 0; i < used; ++i) {
        int a = mChosen[i] / mWords;
        int b = mChosen[i] % mWords;
        if ((symmetry & 1) != 0) {
          final int saved = a;
          a = b;
          b = saved;
        }
        if ((symmetry & 2) != 0) {
          a = complement(a);
          b = complement(b);
        }
        if ((symmetry & 4) != 0) {
          a = mReverse[a];
          b = mReverse[b];
        }
        copy[i] = a * mWords + b;
      }
      Arrays.sort(copy);
      for (int i = 0; i < used; ++i) {
        if (copy[i] < mChosen[i]) {
          return false;
        }
        if (copy[i] > mChosen[i]) {
          break;
        }
      }
    }
    return true;
  }

  private int complement(final int w) {
    return ((w + 2) ^ ((1 << mWord[w].length()) - 1)) - 2;
  }

  private void check(final int used) {
    final List<Tile> tiles = new ArrayList<>();
    for (int i = 0; i < used; ++i) {
      final int tile = mChosen[i];
      tiles.add(new Tile(mWord[tile / mWords], mWord[tile % mWords]));
    }
    final Instance forward = new Instance(tiles);
    if (!forward.canStart()) {
      return;
    }
    final Instance backward = forward.reverse();
    if (!backward.canStart()) {
      return;
    }
    if (mSearchHorizon >= 0) {
      int shortest = meet(forward, backward, mSearchHorizon);
      if (shortest == UNKNOWN && mSearchHorizon <= 128) {
        shortest = meet(forward, backward, mSearchHorizon, new BalanceDistance(forward, mSearchHorizon));
      }
      if (shortest > 0 || shortest == 0 && mAssumeHorizon) {
        mMaximum = Math.max(mMaximum, shortest);
        return;
      }
    }
    int solution = forward.search("", 0, FRONTIER);
    if (solution < 0) {
      solution = backward.search("", 0, FRONTIER);
    }
    if (solution < 0) {
      solution = forward.search("", forward.mask(backward), REFINEMENT);
    }
    if (solution < 0) {
      solution = meet(forward, backward);
    }
    if (solution < 0) {
      solution = backward.search("", backward.mask(forward), REFINEMENT);
    }
    if (solution < 0) {
      for (int k = mWidth; k <= 5; ++k) {
        if (forward.closesCover(backward, k) || backward.closesCover(forward, k)) {
          solution = 0;
          break;
        }
      }
    }
    if (solution < 0) {
      if (mNonhaltingCertificate.test(forward.toString())) {
        return;
      }
      if (++mUnknown <= 100) {
        System.err.println("Unresolved PCP instance: " + forward);
      }
    } else {
      mMaximum = Math.max(mMaximum, solution);
    }
  }

  private void visit(final int used, final int next, final boolean fullWidth) {
    if (fullWidth && representative(used)) {
      check(used);
    }
    if (used < mWidth) {
      for (int tile = next; tile < mWords * mWords; ++tile) {
        final int i = tile / mWords;
        final int j = tile % mWords;
        if (i != j) {
          // A diagonal tile would already supply a one-tile solution.
          mChosen[used] = tile;
          visit(used + 1, tile + 1, fullWidth || Math.max(mWord[i].length(), mWord[j].length()) == mWidth);
        }
      }
    }
  }

  /**
   * Maximum shortest solution length for at most n pairs and width n.
   * @param n maximum pair count and exact width
   * @return the verified maximum
   */
  public static int maximum(final int n) {
    // A finite probe finds solutions faster, but a probe alone cannot
    // rule out an instance that has only longer solutions.
    return maximum(n, n == 3 ? 96 : -1, false);
  }

  /**
   * Check width three using the upper bound for nonerasing binary
   * instances with at most three rules (Rahn, Example 16b and Sec. 109).
   * @return the maximum shortest length under that published result
   */
  public static int maximumUsingRahnHorizon() {
    return maximum(3, RAHN_HORIZON, true);
  }

  private static int maximum(final int n, final int horizon, final boolean assumeHorizon) {
    return maximum(n, horizon, assumeHorizon, x -> false);
  }

  static int maximumWithCheckedCertificates(final Predicate<String> certificate) {
    return maximum(3, 96, false, certificate);
  }

  private static int maximum(final int n, final int horizon, final boolean assumeHorizon, final Predicate<String> certificate) {
    if (n == 0) {
      return 0;
    }
    if (n < 0 || n > 3) {
      throw new UnsupportedOperationException("Only widths one through three verified");
    }
    final PcpBusyBeaver search = new PcpBusyBeaver(n, horizon, assumeHorizon);
    search.mNonhaltingCertificate = certificate;
    search.visit(0, 0, false);
    if (search.mUnknown > 0) {
      throw new IllegalStateException(search.mUnknown + " unresolved PCP instances; lower bound " + search.mMaximum);
    }
    return search.mMaximum;
  }

  /**
   * Run the exact enumeration or the explicitly theorem-backed replay.
   * @param args pair count, or --rahn-horizon
   */
  public static void main(final String[] args) {
    if (args.length != 1) {
      throw new IllegalArgumentException("Usage: PcpBusyBeaver width | --rahn-horizon");
    }
    System.out.println("--rahn-horizon".equals(args[0]) ? maximumUsingRahnHorizon() : maximum(Integer.parseInt(args[0])));
  }
}
