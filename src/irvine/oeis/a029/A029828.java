package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a013.A013959;

/**
 * A029828 Eisenstein series E_12(q) (alternate convention E_6(q)), multiplied by 691.
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
