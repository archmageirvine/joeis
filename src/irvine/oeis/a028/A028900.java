package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028900 Map <code>n =</code> Sum <code>c_i 10^i</code> to <code>a(n) =</code> Sum <code>c_i 5^i</code>.
 * @author Sean A. Irvine
 */
public class A028900 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long t = ++mN;
    Z sum = Z.ZERO;
    int m = 1;
    while (t != 0) {
      sum = sum.add((t % 10) * m);
      t /= 10;
      m *= 5;
    }
    return sum;
  }
}
