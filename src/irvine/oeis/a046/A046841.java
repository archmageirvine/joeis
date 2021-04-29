package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046841 Sum of divisors divides sum of cubes of divisors.
 * @author Sean A. Irvine
 */
public class A046841 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma(3).mod(fs.sigma()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
