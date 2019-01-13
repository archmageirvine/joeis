package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015809.
 * @author Sean A. Irvine
 */
public class A015809 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final FactorSequence fs = Cheetah.factor(mN);
      if (Z.ZERO.equals(fs.sigma(3).mod(fs.phi()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
