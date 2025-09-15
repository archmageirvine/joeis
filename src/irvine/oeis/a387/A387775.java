package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A387775 allocated for Ruud H.G. van Tol.
 * @author Sean A. Irvine
 */
public class A387775 extends A000040 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z p = super.next();
    if (mA.compareTo(p) < 0) {
      mA = mA.multiply(p);
    } else {
      mA = mA.mod(p);
    }
    return mA;
  }
}
