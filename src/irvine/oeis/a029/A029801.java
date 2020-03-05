package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029801 Squares such that <code>sqrt(n), n</code> and <code>n^(3/2)</code> all have same digits.
 * @author Sean A. Irvine
 */
public class A029801 extends A029800 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
