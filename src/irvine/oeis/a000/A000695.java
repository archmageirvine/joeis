package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000695 Moser-de Bruijn sequence: sums of distinct powers of 4.
 * @author Sean A. Irvine
 */
public class A000695 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(Z n) {
    Z sum = Z.ZERO;
    int j = 0;
    while (!n.isZero()) {
      if (n.testBit(0)) {
        sum = sum.add(Z.ONE.shiftLeft(j));
      }
      n = n.divide2();
      j += 2;
    }
    return sum;
  }

  @Override
  public Z a(int n) {
    Z sum = Z.ZERO;
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
