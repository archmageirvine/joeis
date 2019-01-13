package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002180.
 * @author Sean A. Irvine
 */
public class A002180 extends A002202 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(2);
  }
}
