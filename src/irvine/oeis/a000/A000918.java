package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000918 a(n) = 2^n - 2.
 * @author Sean A. Irvine
 */
public class A000918 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(2);
  }

  @Override
  public Z a(final Z n) {
    return Z.ONE.shiftLeft(n.longValueExact()).subtract(2);
  }

  @Override
  public Z a(final long n) {
    return Z.ONE.shiftLeft(n).subtract(2);
  }

}

