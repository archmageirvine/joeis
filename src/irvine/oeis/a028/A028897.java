package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028897 If n = Sum c_i 10^i then a(n) = Sum c_i 2^i.
 * @author Sean A. Irvine
 */
public class A028897 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long t = ++mN;
    Z sum = Z.ZERO;
    int m = -1;
    while (t != 0) {
      sum = sum.add((t % 10) << ++m);
      t /= 10;
    }
    return sum;
  }
}
