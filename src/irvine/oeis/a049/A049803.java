package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049803 a(n) = n mod 3 + n mod 9 + ... + n mod 3^k, where 3^k &lt;= n &lt; 3^(k+1).
 * @author Sean A. Irvine
 */
public class A049803 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long mod = 3; mod < mN; mod *= 3) {
      sum = sum.add(mN % mod);
    }
    return sum;
  }
}
