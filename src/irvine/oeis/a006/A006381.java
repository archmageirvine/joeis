package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006381.
 * @author Sean A. Irvine
 */
public class A006381 extends A006380 {

  private int mM = -1;

  @Override
  public Z next() {
    return t(3, ++mM);
  }
}
