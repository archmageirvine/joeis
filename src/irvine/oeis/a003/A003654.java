package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003654 Squarefree integers m such that the fundamental unit of Q(sqrt(m)) has norm -1. Also, squarefree integers m such that the Pell equation x^2 - m*y^2 = -1 is soluble.
 * @author Sean A. Irvine
 */
public class A003654 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.maxExponent() <= 1) {
        boolean ok = true;
        for (final Z p : fs.toZArray()) {
          if (p.mod(4) == 3) {
            ok = false;
            break;
          }
        }
        if (ok && (Convergents.continuedFractionConvergentsSqrt(mN).size() & 1) == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
