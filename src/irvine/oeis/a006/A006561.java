package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a007.A007569;

/**
 * A006561 Number of intersections of diagonals in the interior of regular <code>n-gon</code>.
 * @author Sean A. Irvine
 */
public class A006561 extends A007569 {

  @Override
  public Z next() {
    return super.next().subtract(mN);
  }
}
