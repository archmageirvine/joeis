package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049804 a(n) = n mod 4 + n mod 16 + ... + n mod 4^k, where 4^k &lt;= n &lt; 4^(k+1).
 * @author Sean A. Irvine
 */
public class A049804 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long mod = 4; mod < mN; mod <<= 2) {
      sum = sum.add(mN & (mod - 1));
    }
    return sum;
  }
}
