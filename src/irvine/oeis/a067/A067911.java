package irvine.oeis.a067;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A067911 Product of gcd(k,n) for 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A067911 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 2; k <= mN; ++k) {
      prod = prod.multiply(LongUtils.gcd(mN, k));
    }
    return prod;
  }
}
