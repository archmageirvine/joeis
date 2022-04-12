package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056013 Numbers n such that n | sigma(n) - d(n) + phi(n).
 * @author Sean A. Irvine
 */
public class A056013 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma().subtract(fs.sigma0()).add(fs.phi()).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
