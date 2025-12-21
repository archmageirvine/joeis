package irvine.oeis.a100;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A100762 Let n = 2^e_2 * 3^e_3 * 5^e_5 * ... be the prime factorization of n and let P(n) = A100549(n); then a(n) = Product_{ q &lt;= P(n) } q^e_q; a(1) = 1 by convention.
 * @author Sean A. Irvine
 */
public class A100762 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    final Z q = Functions.PREV_PRIME.z(fs.maxExponent() + 2);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      if (p.compareTo(q) > 0) {
        break;
      }
      prod = prod.multiply(p.pow(fs.getExponent(p)));
    }
    return prod;
  }
}
