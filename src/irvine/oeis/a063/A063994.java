package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063994 a(n) = Product_{primes p dividing n } gcd(p-1, n-1).
 * @author Sean A. Irvine
 */
public class A063994 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      prod = prod.multiply(LongUtils.gcd(mN - 1, p.longValue() - 1));
    }
    return prod;
  }
}
