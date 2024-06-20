package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046841 Numbers whose sum of divisors divides their sum of cubes of divisors.
 * @author Sean A. Irvine
 */
public class A046841 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(3).mod(fs.sigma()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
