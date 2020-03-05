package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a013.A013959;

/**
 * A029828 Eisenstein series <code>E_12(q)</code> (alternate convention <code>E_6(q))</code>, multiplied by 691.
 * @author Sean A. Irvine
 */
public class A029828 extends A013959 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.valueOf(691);
    }
    return super.next().multiply(65520);
  }
}
