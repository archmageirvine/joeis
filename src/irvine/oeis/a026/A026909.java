package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026909 (1/2)*T(2n,n), T given by A026907.
 * @author Sean A. Irvine
 */
public class A026909 extends A026908 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
