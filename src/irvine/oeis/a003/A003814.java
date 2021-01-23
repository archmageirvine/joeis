package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003814 Numbers n such that the continued fraction for sqrt(n) has odd period length (values of n).
 * @author Sean A. Irvine
 */
public class A003814 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long s = LongUtils.sqrt(mN);
      if (s * s != mN) {
        final FactorSequence fs = Cheetah.factor(mN);
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
