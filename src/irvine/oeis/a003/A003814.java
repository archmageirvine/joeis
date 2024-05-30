package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.cr.Convergents;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003814 Numbers k such that the continued fraction for sqrt(k) has odd period length.
 * @author Sean A. Irvine
 */
public class A003814 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long s = Functions.SQRT.l(mN);
      if (s * s != mN) {
        final FactorSequence fs = Jaguar.factor(mN);
        boolean ok = true;
        for (final Z p : fs.toZArray()) {
          if ((p.longValueExact() & 3) == 3) {
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
