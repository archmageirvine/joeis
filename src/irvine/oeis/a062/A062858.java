package irvine.oeis.a062;

import irvine.math.z.Z;

/**
 * A062858 In the triangular multiplication table of size A062859(n), the smallest number which appears n times.
 * @author Sean A. Irvine
 */
public class A062858 extends A062859 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mMaxCountMinValue);
  }
}
