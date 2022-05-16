package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046685 Numbers k such that the sum of cubes of divisors of k and the sum of 4th powers of divisors of k are relatively prime.
 * @author Sean A. Irvine
 */
public class A046685 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Z.ONE.equals(fs.sigma(3).gcd(fs.sigma(4)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
