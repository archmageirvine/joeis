package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390258 allocated for Werner Schulte.
 * @author Sean A. Irvine
 */
public class A390258 extends Sequence1 {

  private long mN = 0;

  // ultiplicative sequence a(n) with a(p^e) = p^(e-1) * (e + 1) * (p * (2 + e) - e) / 2 for prime p and e > 0.

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      prod = prod.multiply(p.pow(e - 1).multiply(e + 1).multiply(p.multiply(2 + e).subtract(e)).divide2());
    }
    return prod;
  }
}
