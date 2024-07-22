package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A061602 Sum of factorials of the digits of n.
 * @author Sean A. Irvine
 */
public class A061602 extends Sequence0 implements DirectSequence {

  private static final Z[] FACT_LIST = new Z[] {Z.ONE, Z.ONE, Z.TWO, Z.SIX, Z.valueOf(24),
    Z.valueOf(120), Z.valueOf(720), Z.valueOf(5040), Z.valueOf(40320), Z.valueOf(362880L)};
  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    Z m = n;
    Z sum = Z.ZERO;
    do {
      sum = sum.add(FACT_LIST[m.mod(Z.TEN).intValueExact()]);
      m = m.divide(10);
    } while (!m.isZero());
    return sum;
  }

  @Override
  public Z a(final int n) {
    int m = n;
    Z sum = Z.ZERO;
    do {
      sum = sum.add(FACT_LIST[m % 10]);
      m /= 10;
    } while (m != 0);
    return sum;
  }

}

