package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046870 Sigma(1,n) divides Sigma(4,n).
 * @author Sean A. Irvine
 */
public class A046870 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma(4).mod(fs.sigma()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
