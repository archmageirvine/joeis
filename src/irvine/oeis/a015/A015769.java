package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015769 Numbers k such that <code>phi(k) | sigma_11(k)</code>.
 * @author Sean A. Irvine
 */
public class A015769 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma(11).mod(fs.phi()).equals(Z.ZERO)) {
        return Z.valueOf(mN);
      }
    }
  }
}
