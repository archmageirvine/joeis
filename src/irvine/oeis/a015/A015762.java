package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015762 Numbers n such that phi(n) | sigma_4(n).
 * @author Sean A. Irvine
 */
public class A015762 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(4).mod(fs.phi()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
