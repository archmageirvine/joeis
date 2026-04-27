package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A045503 If decimal expansion of n is ab...d, a(n) = a^a + b^b +...+ d^d.
 * @author Sean A. Irvine
 */
public class A045503 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    long m = n;
    while (m != 0) {
      final long r = m % 10;
      sum = sum.add(Z.valueOf(r).pow(r));
      m /= 10;
    }
    return sum;
  }

}
