package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081853 Consider recurrence b(0) = (2n+1)/2, b(n) = b(n-1)*ceiling(b(n-1)); sequence gives first integer reached.
 * @author Sean A. Irvine
 */
public class A081853 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Q b = new Q(2 * ++mN + 1, 2);
    while (!b.isInteger()) {
      b = b.multiply(b.ceiling());
    }
    return b.toZ();
  }
}

