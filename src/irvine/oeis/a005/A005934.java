package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005934 Highly powerful numbers: numbers with record value of the product of the exponents in prime factorization (A005361).
 * @author Sean A. Irvine
 */
public class A005934 implements Sequence {

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
        return Z.valueOf(mN);
      }
    }
  }
}
