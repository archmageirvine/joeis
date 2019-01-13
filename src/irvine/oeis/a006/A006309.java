package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006309.
 * @author Sean A. Irvine
 */
public class A006309 extends A006308 {

  @Override
  protected int coeffNumber() {
    return mP - 3;
  }

  @Override
  protected Z sign(final Z n) {
    return n;
  }
}

