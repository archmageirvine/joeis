package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054412 Numbers n such that, in the prime factorization of n, the product of exponents equals the product of prime factors.
 * @author Sean A. Irvine
 */
public class A054412 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
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
