package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000351 Powers of 5: a(n) = 5^n.
 * @author Sean A. Irvine
 */
public class A000351 extends Sequence0 implements DirectSequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(5);
    }
    return mA;
  }

  @Override
  public Z a(final Z n) {
    return Z.FIVE.pow(n);
  }

  @Override
  public Z a(final int n) {
    return Z.FIVE.pow(n);
  }

}
