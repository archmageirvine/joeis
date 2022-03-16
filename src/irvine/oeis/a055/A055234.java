package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055234 Smallest x such that sigma(x) = n*phi(x), or -1 if no such x exists.
 * @author Sean A. Irvine
 */
public class A055234 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final FactorSequence fs = Cheetah.factor(++k);
      if (fs.sigma().equals(fs.phi().multiply(mN))) {
        return Z.valueOf(k);
      }
    }
  }
}
