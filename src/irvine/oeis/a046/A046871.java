package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046871 Numbers n such that sigma(2,n) divides sigma(4,n).
 * @author Sean A. Irvine
 */
public class A046871 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(4).mod(fs.sigma2()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
