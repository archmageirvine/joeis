package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049802 a(n) = n mod 2 + n mod 4 + ... + n mod 2^k, where 2^k &lt;= n &lt; 2^(k+1).
 * @author Sean A. Irvine
 */
public class A049802 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long mod = 2; mod < mN; mod <<= 1) {
      sum = sum.add(mN & (mod - 1));
    }
    return sum;
  }
}
