package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038025 Winner of n-th Littlewood Frog Race.
 * @author Sean A. Irvine
 */
public class A038025 extends Sequence1 {

  // After R. J. Mathar

  private final Fast mPrime = new Fast();
  protected long mN = 0;

  protected long p(final long n, final long k) {
    long a = -1;
    while (true) {
      if (mPrime.isPrime(++a * n + k)) {
        return a;
      }
    }
  }

  protected long select(final long a, final long phimax) {
    return a;
  }

  @Override
  public Z next() {
    ++mN;
    long phimax = 0;
    long a = 0;
    for (long k = 1; k <= mN; ++k) {
      if (Functions.GCD.l(k, mN) == 1) {
        final long phi = p(mN, k);
        if (phi >= phimax) {
          a = k;
          phimax = phi;
        }
      }
    }
    return Z.valueOf(select(a, phimax));
  }
}
