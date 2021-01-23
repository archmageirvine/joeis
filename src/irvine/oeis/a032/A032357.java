package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A032357 Convolution of Catalan numbers and powers of -1.
 * @author Sean A. Irvine
 */
public class A032357 extends A000108 {

  private Z mA = Z.ZERO;
  private boolean mSign = false;

  @Override
  public Z next() {
    mSign = !mSign;
    mA = mA.signedAdd(mSign, super.next());
    return mA.abs();
  }
}
