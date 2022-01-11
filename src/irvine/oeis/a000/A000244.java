package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000244 Powers of 3: a(n) = 3^n.
 * @author Sean A. Irvine
 */
public class A000244 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(3);
    }
    return mA;
  }
}

