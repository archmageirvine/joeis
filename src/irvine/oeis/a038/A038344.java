package irvine.oeis.a038;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038344 Numbers n such that phi(n)+sigma(n) is a prime.
 * @author Sean A. Irvine
 */
public class A038344 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma().add(fs.phi()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
