package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036965 Record values of the product of the exponents in the prime factorization of highly powerful numbers (A005934).
 * @author Sean A. Irvine
 */
public class A036965 extends Sequence1 {

  private long mN = 0;
  private Z mBest = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      Z prod = Z.ONE;
      final FactorSequence fs = Jaguar.factor(++mN);
      for (final Z p : fs.toZArray()) {
        prod = prod.multiply(fs.getExponent(p));
      }
      if (prod.compareTo(mBest) > 0) {
        mBest = prod;
        return prod;
      }
    }
  }
}
