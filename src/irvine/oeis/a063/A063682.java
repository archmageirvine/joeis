package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a058.A058866;

/**
 * A058866.
 * @author Sean A. Irvine
 */
public class A063682 extends A058866 {

  @Override
  public Z next() {
    step();
    return mN1.coeff(mK).toZ();
  }
}

