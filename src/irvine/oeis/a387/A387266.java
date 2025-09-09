package irvine.oeis.a387;

import irvine.factor.prime.Fast;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387266 Rectangular array (d(n,k)) read by falling antidiagonals: d(n,k) is the denominator array of q(n,k) in the array V(1), defined in Comments.
 * @author Sean A. Irvine
 */
public class A387266 extends Sequence1 {

  // Differs from Kimberling description in indexing here starts from 0

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Long> mD = new MemoryFunctionInt2<>() {

    private boolean isOk(final long p, final int n) {
      for (int h = 0; h < n; ++h) {
        int k = 0;
        while (true) {
          final long q = get(h, k);
          if (q == p) {
            return false;
          }
          if (q > p) {
            break;
          }
          ++k;
        }
      }
      return true;
    }

    @Override
    protected Long compute(final int n, final int m) {
      if (n == 0) {
        if (m == 0) {
          return 2L;
        }
        final long p = get(n, m - 1);
        final long q = mPrime.nextPrime(p);
        long r = p;
        while (true) {
          r = mPrime.nextPrime(r);
          if (r * q > p * mPrime.nextPrime(r)) {
            return r;
          }
        }
      }
      if (m == 0) {
        long p = 1;
        while (true) {
          p = mPrime.nextPrime(p);
          if (isOk(p, n)) {
            return p;
          }
        }
      } else {
        final long p = get(n, m - 1);
        final long q = mPrime.nextPrime(p);
        long r = p;
        while (true) {
          r = mPrime.nextPrime(r);
          if (r * q > p * mPrime.nextPrime(r) && isOk(r, n)) {
            return r;
          }
        }
      }
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mD.get(mM, mN - mM));
  }
}

