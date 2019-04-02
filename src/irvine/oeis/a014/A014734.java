package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014734 Squares of odd numbers in triangle of Eulerian numbers.
 * @author Sean A. Irvine
 */
public class A014734 extends A014459 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
