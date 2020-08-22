package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028901 Map n = Sum c_i 10^i to a(n) = Sum c_i 6^i.
 * @author Sean A. Irvine
 */
public class A028901 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long t = ++mN;
    Z sum = Z.ZERO;
    int m = 1;
    while (t != 0) {
      sum = sum.add((t % 10) * m);
      t /= 10;
      m *= 6;
    }
    return sum;
  }
}
