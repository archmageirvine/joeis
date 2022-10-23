package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054412 Numbers n such that, in the prime factorization of n, the product of exponents equals the product of prime factors.
 * @author Sean A. Irvine
 */
public class A054412 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Z prodP = Z.ONE;
      Z prodE = Z.ONE;
      for (final Z p : fs.toZArray()) {
        prodP = prodP.multiply(p);
        prodE = prodE.multiply(fs.getExponent(p));
      }
      if (prodP.equals(prodE)) {
        return Z.valueOf(mN);
      }
    }
  }
}
