package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A001019 Powers of 9: a(n) = 9^n.
 * @author Sean A. Irvine
 */
public class A001019 extends Sequence0 implements DirectSequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(9);
    return mN;
  }

  @Override
  public Z a(final Z n) {
    return Z.NINE.pow(n);
  }

  @Override
  public Z a(final int n) {
    return Z.NINE.pow(n);
  }

}
