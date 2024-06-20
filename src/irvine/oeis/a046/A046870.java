package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046870 Numbers k such that sigma_1(k) divides sigma_4(k).
 * @author Sean A. Irvine
 */
public class A046870 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(4).mod(fs.sigma()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
