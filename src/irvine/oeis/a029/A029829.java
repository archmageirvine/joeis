package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a013.A013963;

/**
 * A029829 Eisenstein series <code>E_16(q)</code> (alternate convention <code>E_8(q))</code>, multiplied by 3617.
 * @author Sean A. Irvine
 */
public class A029829 extends A013963 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.valueOf(3617);
    }
    return super.next().multiply(16320);
  }
}
