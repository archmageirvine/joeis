package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A011557 Powers of 10: a(n) = 10^n.
 * @author Sean A. Irvine
 */
public class A011557 extends Sequence0 implements DirectSequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return mA;
  }

  @Override
  public Z a(final Z n) {
    return Z.TEN.pow(n);
  }

  @Override
  public Z a(final int n) {
    return Z.TEN.pow(n);
  }

}
