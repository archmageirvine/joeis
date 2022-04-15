package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056097 Numbers n such that phi(n) + 1 | sigma(n).
 * @author Sean A. Irvine
 */
public class A056097 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma().mod(fs.phi().add(1)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
