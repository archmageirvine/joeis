package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000058;

/**
 * A002966 Egyptian fractions: number of solutions of 1 = 1/x_1 + ... + 1/x_n where 0 &lt; x_1 &lt;= ... &lt;= x_n.
 * @author Sean A. Irvine
 */
public class A002966 extends A000058 {

  // Based on a C++ implementation by Jacques Le Normand
  // Correctly calculates to a(8) -- there might be overflow beyond that -- not tested

  private static final class FastVector {
    // todo make this dynamic in mSize?
    private final int[] mPrime = new int[14];
    private final int[] mExponent = new int[14];
    private int mSize;

    private FastVector() {
      mSize = 0;
    }

    private void add(final int a, final int value) {
      for (int i = 0; i < mSize; ++i) {
        if (mPrime[i] == a) {
          mExponent[i] += value;
          return;
        }
      }
      mPrime[mSize] = a;
      mExponent[mSize] = value;
      ++mSize;
    }

    private int get(final int a) {
      for (int i = 0; i < mSize; ++i) {
        if (mPrime[i] == a) {
          return mExponent[i];
        }
      }
      mPrime[mSize] = a;
      mExponent[mSize] = 0;
      ++mSize;
      return 0;
    }

    private void erase(final int a) {
      for (int i = 0; i < mSize; ++i) {
        if (mPrime[i] == a) {
          mPrime[i] = mPrime[mSize - 1];
          mExponent[i] = mExponent[mSize - 1];
          --mSize;
          return;
        }
      }
    }

  }

  private final FastVector mSoFar = new FastVector();
  private final FastVector mTempFar = new FastVector();

  // This is the meat. it generates all the divisors of denum, and then tests using Polytope's test.
  // mSoFar contains all the prime divisors of denum and their multiplicity. mSoFar is like a map.
  int getDivisors(final long[] num, final long[] denum, long d, final int c, final int start) {
    if (c >= mTempFar.mSize) {
      return (denum[0] + d) % num[0] == 0 && (denum[0] + d) / num[0] >= start ? 1 : 0;
    }
    while (num[0] % mTempFar.mPrime[c] == 0 && mTempFar.mExponent[c] > 0) {
      num[0] /= mTempFar.mPrime[c];
      denum[0] /= mTempFar.mPrime[c];
      mTempFar.mExponent[c]--;
    }
    int ret = 0;
    for (int i = 0; i <= mTempFar.mExponent[c] * 2; ++i) {
      ret += getDivisors(num, denum, d, c + 1, start);
      d *= mTempFar.mPrime[c];
      if (d > denum[0]) {
        break;
      }
    }
    return ret;
  }

  // Recursive with a special case when n = 2.
  private long count(final int n, final long num, final long denum, int start) {
    if (n == 2) {
      System.arraycopy(mSoFar.mPrime, 0, mTempFar.mPrime, 0, mSoFar.mSize);
      System.arraycopy(mSoFar.mExponent, 0, mTempFar.mExponent, 0, mSoFar.mSize);
      mTempFar.mSize = mSoFar.mSize;
      return getDivisors(new long[] {num}, new long[] {denum}, 1, 0, start);
    }
    final long least = denum % num != 0 ? (denum + num - 1) / num : (denum / num) + 1;
    if (start < least) {
      start = (int) least;
    }
    long ret = 0;
    for (int toCheck = (int) ((denum * n) / num); toCheck >= start; --toCheck) {
      final long top = num * toCheck - denum;
      final long bot = toCheck * denum;
      final FactorSequence fs = Cheetah.factor(toCheck);
      for (final Z p : fs.toZArray()) {
        mSoFar.add(p.intValueExact(), fs.getExponent(p));
      }
      ret += count(n - 1, top, bot, toCheck);
      if ((ret >> 32) > 0) { // was 32 in C version
        throw new RuntimeException("overflow");
      }
      for (final Z p : fs.toZArray()) {
        final int pi = p.intValueExact();
        mSoFar.add(pi, -fs.getExponent(p));
        if (mSoFar.get(pi) <= 0) {
          mSoFar.erase(pi);
        }
      }
    }
    return ret;
  }


  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return Z.valueOf(count(mN, 1, 1, 2));
  }
}
