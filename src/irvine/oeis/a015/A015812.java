package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015812 Composite numbers k such that phi(k) <code>+ 2</code> | sigma(k).
 * @author Sean A. Irvine
 */
public class A015812 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.bigOmega() > 1 && Z.ZERO.equals(fs.sigma().mod(fs.phi().add(2)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
