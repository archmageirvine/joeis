package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A049502 Major index of n, 2nd definition.
 * @author Sean A. Irvine
 */
public class A049502 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z a(final int n) {
    long m = n;
    long sum = 0;
    long k = 1;
    while (m > 1) {
      if ((m & 3) == 1) {
        sum += k;
      }
      ++k;
      m >>>= 1;
    }
    return Z.valueOf(sum);
  }

  @Override
  public Z a(final Z n) {
    Z m = n;
    Z sum = Z.ZERO;
    long k = 1;
    while (m.compareTo(Z.ONE) > 0) {
      if (m.and(Z.THREE).equals(Z.ONE)) {
        sum = sum.add(k);
      }
      ++k;
      m = m.divide2();
    }
    return sum;
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
