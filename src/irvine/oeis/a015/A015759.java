package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015759.
 * @author Sean A. Irvine
 */
public class A015759 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma(2).mod(fs.phi()).equals(Z.ZERO)) {
        return Z.valueOf(mN);
      }
    }
  }
}
