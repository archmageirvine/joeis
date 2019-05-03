package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000420 Powers of <code>7: a(n) = 7^n</code>.
 * @author Sean A. Irvine
 */
public class A000420 implements Sequence {

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

