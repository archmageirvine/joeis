package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027413 If n is an odd prime, a(n) = the number of primitive roots mod n, otherwise a(n) =  the number of k &lt; n divisible by at least one but not all of the prime factors of n.
 * @author Sean A. Irvine
 */
public class A027413 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mPrevPhi = Z.ZERO;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      return mN <= 2 ? Z.ZERO : mPrevPhi;
    } else {
      final FactorSequence fs = Jaguar.factor(mN);
      mPrevPhi = fs.phi();
      long prod = 1;
      final long[] pp = new long[fs.omega()];
      int j = 0;
      for (final Z p : fs.toZArray()) {
        final long v = p.longValue();
        pp[j++] = v;
        prod *= v;
      }
      long c = 0;
      for (long k = 2; k < mN; ++k) {
        if (Functions.GCD.l(k, prod) != prod) {
          for (final long p : pp) {
            if (p > k) {
              break;
            } else if (k % p == 0) {
              ++c;
              break;
            }
          }
        }
      }
      return Z.valueOf(c);
    }
  }
}
