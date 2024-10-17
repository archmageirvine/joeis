package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A059905 Index of first half of decomposition of integers into pairs based on A000695.
 * @author Sean A. Irvine
 */
public class A059905 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z a(Z n) {
    Z r = Z.ZERO;
    Z b = Z.ONE;
    while (!n.isZero()) {
      if (n.testBit(0)) {
        r = r.or(b);
      }
      n = n.shiftRight(2);
      b = b.multiply2();
    }
    return r;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
