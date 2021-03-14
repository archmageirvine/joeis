package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045512.
 * @author Sean A. Irvine
 */
public class A045512 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    long m = ++mN;
    while (m != 0) {
      final long r = m % 10;
      if (r != 0) {
        sum = sum.add(Z.valueOf(r).pow(r));
      }
      m /= 10;
    }
    return sum;
  }
}
