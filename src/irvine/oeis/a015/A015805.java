package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015805 Numbers k such that <code>phi(k) + 12 | sigma(k)</code>.
 * @author Sean A. Irvine
 */
public class A015805 implements Sequence {

  private long mN = 23;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Z.ZERO.equals(fs.sigma().mod(fs.phi().add(12)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
