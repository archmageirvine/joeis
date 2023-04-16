package irvine.oeis.a062;

import irvine.math.z.Z;

/**
 * A062856 In the square multiplication table of size A062857(n), the smallest number which appears n times.
 * @author Sean A. Irvine
 */
public class A062856 extends A062857 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mMaxCountMinValue);
  }
}
