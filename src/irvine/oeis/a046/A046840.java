package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046840 Number of divisors divides sum of 4th powers of divisors.
 * @author Sean A. Irvine
 */
public class A046840 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma(4).mod(fs.sigma0()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
