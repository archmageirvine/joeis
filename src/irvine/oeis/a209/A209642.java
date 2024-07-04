package irvine.oeis.a209;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071153.
 * @author Sean A. Irvine
 */
public class A209642 extends Sequence0 {

  // After Indranil Ghosh

  private long mN = -1;

  @Override
  public Z next() {
    long n = ++mN;
    Z s = Z.ZERO;
    Z k = Z.ONE;
    while (n != 0) {
      if ((n & 1) == 0) {
        s = s.multiply(4).add(1);
      } else {
        s = s.add(k).multiply2();
      }
      n /= 2;
      k = k.multiply(4);
    }
    return s;
  }
}
