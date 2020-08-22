package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000400 Powers of 6: a(n) = 6^n.
 * @author Sean A. Irvine
 */
public class A000400 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(6);
    }
    return mA;
  }
}

