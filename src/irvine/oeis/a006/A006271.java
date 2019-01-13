package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006271.
 * @author Sean A. Irvine
 */
public class A006271 extends A006266 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.TWO;
    }
    return super.next().square().add(1);
  }
}
