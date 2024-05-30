package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067911 Product of gcd(k,n) for 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A067911 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 2; k <= mN; ++k) {
      prod = prod.multiply(Functions.GCD.l(mN, k));
    }
    return prod;
  }
}
