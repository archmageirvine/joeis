package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033632 Numbers n such that sigma(phi(n)) = phi(sigma(n)).
 * @author Sean A. Irvine
 */
public class A033632 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z sigma = fs.sigma();
      final Z phi = fs.phi();
      if (Cheetah.factor(phi).sigma().equals(Cheetah.factor(sigma).phi())) {
        return Z.valueOf(mN);
      }
    }
  }
}
