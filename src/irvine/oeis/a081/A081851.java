package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A081851 Consider recurrence b(0) = (2n+1)/4, b(n) = b(0)*ceiling(b(n-1)); sequence gives first integer reached (or -1 if no integer is ever reached).
 * @author Sean A. Irvine
 */
public class A081851 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Q b0 = new Q(2 * ++mN + 1, 4);
    Q b = b0;
    while (!b.isInteger()) {
      b = b0.multiply(b.ceiling());
    }
    return b.toZ();
  }
}

