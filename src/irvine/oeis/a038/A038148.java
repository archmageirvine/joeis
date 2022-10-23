package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038148 Number of 3-infinitary divisors of n: if n = Product p(i)^r(i) and d = Product p(i)^s(i), each s(i) has a digit a &lt;= b in its ternary expansion everywhere that the corresponding r(i) has a digit b, then d is a 3-infinitary-divisor of n.
 * @author Sean A. Irvine
 */
public class A038148 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      int e = fs.getExponent(p);
      while (e != 0) {
        prod = prod.multiply((e % 3) + 1);
        e /= 3;
      }
    }
    return prod;
  }
}
