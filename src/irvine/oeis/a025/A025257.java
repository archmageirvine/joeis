package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025257.
 * @author Sean A. Irvine
 */
public class A025257 extends A025256 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}
