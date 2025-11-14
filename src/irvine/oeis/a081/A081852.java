package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A081852 Consider recurrence b(0) = n/3, b(n) = b(0)*ceiling(b(n-1)); sequence gives first integer reached (or -1 if no integer is ever reached).
 * @author Sean A. Irvine
 */
public class A081852 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    final Q b0 = new Q(++mN, 3);
    Q b = b0;
    while (!b.isInteger()) {
      b = b0.multiply(b.ceiling());
    }
    return b.toZ();
  }
}

