package irvine.oeis.a010;

import irvine.math.z.Z;

/**
 * A010796.
 * @author Sean A. Irvine
 */
public class A010796 extends A010790 {

  {
    next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
