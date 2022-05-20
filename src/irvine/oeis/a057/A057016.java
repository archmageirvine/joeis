package irvine.oeis.a057;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057016 Consider recurrence b(0) = (2n+1)/2, b(n) = b(n-1)*floor(b(n-1)); sequence gives first integer reached.
 * @author Sean A. Irvine
 */
public class A057016 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    Q b = new Q(2 * ++mN + 1, 2);
    do {
      b = b.multiply(b.toZ());
    } while (!b.isInteger());
    return b.toZ();
  }
}
