package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000007 The characteristic function of {0}: a(n) = 0^n.
 * @author Sean A. Irvine
 */
public class A000007 extends Sequence0 implements DirectSequence {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return Z.ZERO;
  }

  @Override
  public Z a(final Z n) {
    return n.isZero() ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z a(final int n) {
    return (n == 0) ? Z.ONE : Z.ZERO;
  }

}

