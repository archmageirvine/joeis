package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014732 Squares of numbers in triangle of Eulerian numbers that are not 1.
 * @author Sean A. Irvine
 */
public class A014732 extends A014449 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
