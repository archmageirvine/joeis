package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001599.
 * @author Sean A. Irvine
 */
public class A001599 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Z.ZERO.equals(Z.valueOf(fs.sigma0()).multiply(mN).mod(fs.sigma()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
