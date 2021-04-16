package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046673 a(n) = (2n)!*Sum_{i=1..n} 1/i.
 * @author Sean A. Irvine
 */
public class A046673 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(2L * ++mN).multiply(2L * mN - 1);
    Z sum = mF;
    for (long k = 2; k <= mN; ++k) {
      sum = sum.add(mF.divide(k));
    }
    return sum;
  }
}
