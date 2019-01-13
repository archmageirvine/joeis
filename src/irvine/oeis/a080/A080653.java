package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a007.A007378;

/**
 * A080653.
 * @author Sean A. Irvine
 */
public class A080653 extends A007378 {

  {
    next();
  }

  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}
