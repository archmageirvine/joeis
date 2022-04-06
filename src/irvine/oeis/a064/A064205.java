package irvine.oeis.a064;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A064205 Numbers n such that sigma(n) + tau(n) is a prime.
 * @author Sean A. Irvine
 */
public class A064205 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma().add(fs.sigma0()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
