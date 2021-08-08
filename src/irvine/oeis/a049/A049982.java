package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049982 Number of arithmetic progressions of 2 or more positive integers, strictly increasing with sum n.
 * @author Sean A. Irvine
 */
public class A049982 extends A049980 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
