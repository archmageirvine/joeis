package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006454.
 * @author Sean A. Irvine
 */
public class A006454 extends A006452 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().square().subtract(1);
  }
}
