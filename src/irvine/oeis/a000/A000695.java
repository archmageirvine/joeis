package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000695.
 * @author Sean A. Irvine
 */
public class A000695 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    long n = ++mN;
    int j = 0;
    while (n != 0) {
      if ((n & 1) == 1) {
        sum = sum.add(Z.ONE.shiftLeft(j));
      }
      n >>>= 1;
      j += 2;
    }
    return sum;
  }
}
