package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015808 k is the first integer such that phi(k) + n | sigma(k).
 * @author Sean A. Irvine
 */
public class A015808 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final FactorSequence fs = Cheetah.factor(++k);
      if (Z.ZERO.equals(fs.sigma().mod(fs.phi().add(mN)))) {
        return Z.valueOf(k);
      }
    }
  }
}
