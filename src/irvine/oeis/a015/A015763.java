package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015763 Numbers k such that phi(k) divides sigma_5(k).
 * @author Sean A. Irvine
 */
public class A015763 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma(5).mod(fs.phi()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
