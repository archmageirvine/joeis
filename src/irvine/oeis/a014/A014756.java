package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014756 Squares of numbers in array formed from odd elements to the right of middle of rows of triangle of Eulerian numbers.
 * @author Sean A. Irvine
 */
public class A014756 extends A014469 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
