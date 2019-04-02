package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014748 Squares of numbers in array formed from elements to the right of middle of rows of triangle of Eulerian numbers.
 * @author Sean A. Irvine
 */
public class A014748 extends A014467 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
