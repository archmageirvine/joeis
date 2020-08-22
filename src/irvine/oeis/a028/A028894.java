package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a005.A005614;

/**
 * A028894 a(n) = either 4a(n-1)+1 or 4a(n-1)+3 depending on corresponding term of A005614, +1 for 0, +3 for 1.
 * @author Sean A. Irvine
 */
public class A028894 extends A005614 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      super.next();
    } else {
      mA = mA.shiftLeft(2).add(super.next().multiply2().add(1));
    }
    return mA;
  }
}
