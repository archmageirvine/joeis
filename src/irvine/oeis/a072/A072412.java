package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072412 Numbers k such that the LCM of exponents in the prime factorization of k does not equal the largest exponent.
 * @author Sean A. Irvine
 */
public class A072412 extends Sequence1 {

  private long mN = 35;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Z lcm = Z.ONE;
      for (final Z p : fs.toZArray()) {
        lcm = lcm.lcm(fs.getExponent(p));
      }
      if (!lcm.equals(Z.valueOf(fs.maxExponent()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
