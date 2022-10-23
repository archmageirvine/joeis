package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000420 Powers of 7: a(n) = 7^n.
 * @author Sean A. Irvine
 */
public class A000420 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(7);
    }
    return mA;
  }
}

