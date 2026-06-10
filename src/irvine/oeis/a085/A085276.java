package irvine.oeis.a085;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A085276 Integer reached in A072340.
 * @author Sean A. Irvine
 */
public class A085276 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    Q x = new Q(++mN, 3);
    while (!x.isInteger()) {
      x = x.multiply(x.ceiling());
    }
    return x.toZ();
  }
}
