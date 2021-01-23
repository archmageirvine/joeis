package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003654 Squarefree integers n such that fundamental unit of Q(sqrt(n)) has norm -1. Also, squarefree integers n such that Pell equation x^2 - n y^2 = -1 is soluble.
 * @author Sean A. Irvine
 */
public class A003654 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final FactorSequence fs = Cheetah.factor(mN);
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
