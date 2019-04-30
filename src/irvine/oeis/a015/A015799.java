package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015799 <code>phi(n) + 8 | sigma(n)</code>.
 * @author Sean A. Irvine
 */
public class A015799 implements Sequence {

  private long mN = 21;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Z.ZERO.equals(fs.sigma().mod(fs.phi().add(8)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
