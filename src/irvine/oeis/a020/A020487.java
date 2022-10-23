package irvine.oeis.a020;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020487 Antiharmonic numbers: numbers n such that sigma_1(n) divides sigma_2(n).
 * @author Sean A. Irvine
 */
public class A020487 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma2().mod(fs.sigma()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
