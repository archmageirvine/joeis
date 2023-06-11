package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064049 Number of possible arrangements of numbers 1 to n*(n+1)/2 in a triangle of n rows so that each row and each diagonal is increasing or decreasing.
 * @author Sean A. Irvine
 */
public class A064049 extends A064050 {

  @Override
  public Z next() {
    return super.next().multiply(mN > 1 ? 6 : 1);
  }
}
