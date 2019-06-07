package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a006.A006012;

/**
 * A007052 Number of order-consecutive partitions of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A007052 extends A006012 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
