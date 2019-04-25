package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015800 Numbers n such that phi(n) <code>+ 9</code> | <code>sigma(n)</code>.
 * @author Sean A. Irvine
 */
public class A015800 implements Sequence {

  private long mN = 25;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Z.ZERO.equals(fs.sigma().mod(fs.phi().add(9)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
