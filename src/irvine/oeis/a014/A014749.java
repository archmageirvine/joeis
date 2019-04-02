package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014749 Squares of numbers in array formed from elements to the right of middle of rows of triangle of Eulerian numbers that are not 1.
 * @author Sean A. Irvine
 */
public class A014749 extends A014468 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
