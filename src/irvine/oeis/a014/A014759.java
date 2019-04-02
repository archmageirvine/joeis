package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014759 Squares of numbers in array formed from even elements to the right of middle of rows of triangle of Eulerian numbers.
 * @author Sean A. Irvine
 */
public class A014759 extends A014472 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
