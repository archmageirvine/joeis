package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A395286 Positive integers m such that gcd(m^10 - 1, m! - 1) &gt; 1.
 * @author Sean A. Irvine
 */
public class A395286 extends Sequence1 {

  // This implementation can run in exact (default) or a heuristic mode

  private static final int HEURISTIC = 100;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final boolean mHeuristicMode = "true".equals(System.getProperty("oeis.heuristic"));
  private int mN = 1;
  private final Fast mPrime = new Fast();

  private boolean is(final Z p, final int m) {
    // Check m^10 == 1 mod p
    if (!Z.valueOf(m).modPow(Z.TEN, p).isOne()) {
      return false;
    }
    // Compute m! mod p
    Z prod = Z.ONE;
    for (int k = 1; k <= m; ++k) {
      prod = prod.modMultiply(k, p);
    }
    return prod.isOne();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mHeuristicMode) {
        Z p = Z.valueOf(mN);
        for (int k = 0; k < HEURISTIC; ++k) {
          p = mPrime.nextPrime(p);
          if (is(p, mN)) {
            return Z.valueOf(mN);
          }
        }
        if (mVerbose && mN % 100000 == 0) {
          StringUtils.message("Heuristic search completed to " + mN);
        }
      } else {
        for (final Z p : Jaguar.factor(Z.valueOf(mN).pow(10).subtract(Z.ONE)).toZArray()) {
          if (p.compareTo(Z.valueOf(mN)) > 0) {
            if (is(p, mN)) {
              return Z.valueOf(mN);
            }
          }
        }
        if (mVerbose && mN % 10000 == 0) {
          StringUtils.message("Search completed to " + mN);
        }
      }
    }
  }
}
