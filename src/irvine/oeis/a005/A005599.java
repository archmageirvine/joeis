package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a106.A106400;

/**
 * A005599.
 * @author Sean A. Irvine
 */
public class A005599 extends A106400 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else {
      mA = mA.add(super.next());
      super.next();
      super.next();
    }
    return mA;
  }
}

