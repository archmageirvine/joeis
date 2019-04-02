package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014765 Squares of distinct elements in triangle of Eulerian numbers.
 * @author Sean A. Irvine
 */
public class A014765 extends A014630 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
