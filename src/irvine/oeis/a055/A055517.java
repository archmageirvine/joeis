package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055517 Largest integer k such that k | Phi(k) - d(k) + n, or 0 if no such k exists, where d() is the number of divisors.
 * @author Sean A. Irvine
 */
public class A055517 extends Sequence0 {

  // Heuristic: DO NOT USE TO EXTEND SEQUENCE
  // This will NOT detect if the heuristic has failed

  private static final long HEURISTIC_MULTIPLIER = 10;
  private long mMax = 3;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.ZERO;
    }
    long best = 1;
    long k = 1;
    while (k < HEURISTIC_MULTIPLIER * mMax) {
      final FactorSequence fs = Jaguar.factor(++k);
      if (fs.phi().subtract(fs.sigma0()).add(mN).mod(k) == 0) {
        best = k;
      }
    }
    if (best > mMax) {
      mMax = best;
    }
    return Z.valueOf(best);
  }
}
