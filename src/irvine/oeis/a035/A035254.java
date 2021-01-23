package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035254 First differences of A035253.
 * @author Sean A. Irvine
 */
public class A035254 extends A035214 {

  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.THREE;
    } else {
      mB = mB.subtract(super.next());
    }
    return mB.negate();
  }
}

