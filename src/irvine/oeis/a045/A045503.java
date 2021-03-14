package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045503 If decimal expansion of n is ab...d, a(n) = a^a + b^b +...+ d^d.
 * @author Sean A. Irvine
 */
public class A045503 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    long m = mN;
    while (m != 0) {
      final long r = m % 10;
      sum = sum.add(Z.valueOf(r).pow(r));
      m /= 10;
    }
    return sum;
  }
}
