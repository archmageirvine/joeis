package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006220.
 * @author Sean A. Irvine
 */
public class A006220 extends A006219 {

  private int mN = 0;

  @Override
  public Z next() {
    return f(++mN, mN);
  }
}
