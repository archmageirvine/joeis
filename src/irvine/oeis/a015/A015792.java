package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015792 Numbers k such that <code>phi(k) + 3 | sigma(k)</code>.
 * @author Sean A. Irvine
 */
public class A015792 implements Sequence {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Z.ZERO.equals(fs.sigma().mod(fs.phi().add(3)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
