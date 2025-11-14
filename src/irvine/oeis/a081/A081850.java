package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A081850 Consider recurrence b(0) = (2n+1)/4, b(n) = b(0)*ceiling(b(n-1)); sequence gives number of steps to reach an integer (or -1 if no integer is ever reached).
 * @author Sean A. Irvine
 */
public class A081850 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    long k = 0;
    final Q b0 = new Q(2 * ++mN + 1, 4);
    Q b = b0;
    while (!b.isInteger()) {
      ++k;
      b = b0.multiply(b.ceiling());
    }
    return Z.valueOf(k);
  }
}

