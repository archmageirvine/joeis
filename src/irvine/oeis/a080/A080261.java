package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A080261 Simple involution of natural numbers: complement [binary_width(n)/2] least significant bits in the binary expansion of n.
 * @author Sean A. Irvine
 */
public class A080261 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    if (n.isZero()) {
      return Z.ZERO;
    }
    final long w = n.bitLength() / 2;
    final Z mask = Z.ONE.shiftLeft(w).subtract(1);
    return n.and(mask.not()).add(mask).subtract(n.and(mask));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
