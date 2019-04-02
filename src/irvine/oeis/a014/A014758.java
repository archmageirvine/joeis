package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014758 Squares of numbers in array formed from odd elements to the right of middle of rows of triangle of Eulerian numbers that are not 1.
 * @author Sean A. Irvine
 */
public class A014758 extends A014470 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
