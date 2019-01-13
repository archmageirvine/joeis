package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000634.
 * @author Sean A. Irvine
 */
public class A000634 extends A000636 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(g().coeff(mN - 1).toZ());
  }
}

