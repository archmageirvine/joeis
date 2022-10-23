package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015764 Numbers n such that phi(n) | sigma_6(n).
 * @author Sean A. Irvine
 */
public class A015764 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(6).mod(fs.phi()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
