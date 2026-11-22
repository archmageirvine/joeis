package irvine.oeis.a270;

import java.util.Arrays;
import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000085;

/**
 * A270227 Array read by antidiagonals: T(n,m) is the number of matchings in the rook graph K_n X K_m.
 * @author Gregory Morse
 */
public class A270227 extends AbstractSequence {
  private final boolean mMaximum;
  private int mN = 0;
  private int mK = -1;

  protected A270227(final int offset, final boolean maximum) {
    super(offset);
    mMaximum = maximum;
  }

  /** Construct the sequence. */
  public A270227() {
    this(1, false);
  }

  private static final class Matchings {
    private final boolean mMaximum;
    private final int mWidth;
    private final int mLength;
    private final A000085 mInvolutions = new A000085();
    private final HashMap<String, Z> mCounts = new HashMap<>();

    private Matchings(final int width, final int length, final boolean maximum) {
      mWidth = width;
      mLength = length;
      mMaximum = maximum;
    }

    private static Z pairings(final int n) {
      return Functions.MULTIFACTORIAL.z(2, n - 1L);
    }

    private Z horizontal(final int[] used) {
      Z result = Z.ONE;
      int odd = 0;
      for (int k = 0; k < used.length; ++k) {
        if (used[k] != 0) {
          final int n = mLength - k;
          final Z ways;
          if (mMaximum) {
            odd += (n & 1) * used[k];
            if (odd > 1) {
              return Z.ZERO;
            }
            ways = pairings(n - (n & 1)).multiply((n & 1) == 0 ? 1 : n);
          } else {
            ways = mInvolutions.a(n);
          }
          result = result.multiply(ways.pow(used[k]));
        }
      }
      return result;
    }

    private Z select(final int col, final int k, final int total, final int[] used) {
      if (k < 0) {
        return (total & 1) == 0 ? pairings(total).multiply(count(col + 1, used)) : Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int n = used[k];
      for (int j = 0; j <= n; ++j) {
        used[k] = n - j;
        used[k + 1] += j;
        sum = sum.add(Binomial.binomial(n, j).multiply(select(col, k - 1, total + j, used)));
        used[k + 1] -= j;
      }
      used[k] = n;
      return sum;
    }

    private Z count(final int col, final int[] used) {
      if (col == mLength) {
        return horizontal(used);
      }
      final String key = col + Arrays.toString(used);
      final Z cached = mCounts.get(key);
      if (cached != null) {
        return cached;
      }
      final Z count = select(col, col, 0, used);
      mCounts.put(key, count);
      return count;
    }

    private Z count() {
      // Record how many rows have used each number of squares in column matchings.
      final int[] used = new int[mLength + 1];
      used[0] = mWidth;
      return count(0, used);
    }
  }

  protected final Z matchings(final int m, final int n) {
    return new Matchings(Math.min(m, n), Math.max(m, n), mMaximum).count();
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
    }
    return matchings(mK + getOffset(), mN - mK + getOffset());
  }
}
