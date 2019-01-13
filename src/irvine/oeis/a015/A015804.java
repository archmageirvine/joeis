package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015804.
 * @author Sean A. Irvine
 */
public class A015804 implements Sequence {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Z.ZERO.equals(fs.sigma().mod(fs.phi().add(11)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
