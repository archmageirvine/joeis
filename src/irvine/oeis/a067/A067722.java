package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067722 Least positive integer k such that n*(n + k) is a perfect square.
 * @author Sean A. Irvine
 */
public class A067722 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    long k = 0;
    while (true) {
      if (n.multiply(mN + ++k).isSquare()) {
        return Z.valueOf(k);
      }
    }
  }
}
