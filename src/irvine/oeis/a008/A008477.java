package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008477 If n = Product (p_j^k_j) then a(n) = Product (k_j^p_j).
 * @author Sean A. Irvine
 */
public class A008477 extends Sequence1 {

  protected long mN = 0;

  protected Z f(final long n) {
    Z prod = Z.ONE;
    if (n > 1) {
      final FactorSequence fs = Jaguar.factor(n);
      for (final Z p : fs.toZArray()) {
        prod = prod.multiply(Z.valueOf(fs.getExponent(p)).pow(p));
      }
    }
    return prod;
  }

  @Override
  public Z next() {
    return f(++mN);
  }
}
