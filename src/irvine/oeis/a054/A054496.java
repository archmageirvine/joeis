package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054496 If n = p_1^e_1 *p_2^e_2 *p_3^e_3..., p's = distinct primes, e's = positive integers, then a(n) = p_1^(e_1^2) *p_2^(e_2^2) *p_3^(e_3^2) ... .
 * @author Sean A. Irvine
 */
public class A054496 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Cheetah.factor(++mN);
    for (final Z p : fs.toZArray()) {
      final long e = fs.getExponent(p);
      prod = prod.multiply(p.pow(e * e));
    }
    return prod;
  }
}
