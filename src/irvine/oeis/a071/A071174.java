package irvine.oeis.a071;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071174 Numbers whose sum of exponents is equal to the product of prime factors.
 * @author Sean A. Irvine
 */
public class A071174 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      long e = 0;
      Z prod = Z.ONE;
      for (final Z p : fs.toZArray()) {
        e += fs.getExponent(p);
        prod = prod.multiply(p);
      }
      if (Z.valueOf(e).equals(prod)) {
        return Z.valueOf(mN);
      }
    }
  }
}
