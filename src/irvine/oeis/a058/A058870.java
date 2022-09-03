package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058866.
 * @author Sean A. Irvine
 */
public class A058870 extends A058866 {

  @Override
  public Z next() {
    step();
    return mN.coeff(mK).toZ();
  }
}

