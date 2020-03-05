package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a013.A013967;

/**
 * A029830 Eisenstein series <code>E_20(q)</code> (alternate convention <code>E_10(q))</code>, multiplied by 174611.
 * @author Sean A. Irvine
 */
public class A029830 extends A013967 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.valueOf(174611);
    }
    return super.next().multiply(13200);
  }
}
