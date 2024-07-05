package irvine.oeis.a071;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071175 Numbers whose product of exponents is equal to the sum of prime factors.
 * @author Sean A. Irvine
 */
public class A071175 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Z prod = Z.ONE;
      for (final Z p : fs.toZArray()) {
        prod = prod.multiply(fs.getExponent(p));
      }
      if (prod.equals(fs.sopf())) {
        return Z.valueOf(mN);
      }
    }
  }
}
