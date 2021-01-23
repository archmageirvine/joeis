package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015798 Numbers k such that phi(k) + 7 | sigma(k).
 * @author Sean A. Irvine
 */
public class A015798 implements Sequence {

  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma().mod(fs.phi().add(7)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
