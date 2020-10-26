package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036287 Denominators for Fibonacci Binary Verticals viewed as Periodic Binary Fractions: a(n) = ((2^(3*(2^n))) - 1).
 * @author Sean A. Irvine
 */
public class A036287 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 29) {
      throw new UnsupportedOperationException();
    }
    return Z.ONE.shiftLeft(3 << mN).subtract(1);
  }
}

