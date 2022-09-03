package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058870 Number of 2-trees rooted at an asymmetric edge.
 * @author Sean A. Irvine
 */
public class A058870 extends A058866 {

  @Override
  public Z next() {
    step();
    return mN.coeff(mK).toZ();
  }
}

