package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046840 Number of divisors divides sum of 4th powers of divisors.
 * @author Sean A. Irvine
 */
public class A046840 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(4).mod(fs.sigma0()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
