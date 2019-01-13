package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003601.
 * @author Sean A. Irvine
 */
public class A003601 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z sigma1 = fs.sigma();
      final long sigma0 = fs.sigma0();
      if (sigma1.mod(sigma0) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
