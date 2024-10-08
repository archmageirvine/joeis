package irvine.oeis.a072;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072512 Product of all n - d, where 1 &lt; d &lt; n and d is a divisor of n.
 * @author Sean A. Irvine
 */
public class A072512 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return Integers.SINGLETON.productdiv(mN, d -> d == 1 || d == mN ? Z.ONE : n.subtract(d));
  }
}
