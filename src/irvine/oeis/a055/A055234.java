package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055234 Smallest x such that sigma(x) = n*phi(x), or -1 if no such x exists.
 * @author Sean A. Irvine
 */
public class A055234 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final FactorSequence fs = Jaguar.factor(++k);
      if (fs.sigma().equals(fs.phi().multiply(mN))) {
        return Z.valueOf(k);
      }
    }
  }
}
