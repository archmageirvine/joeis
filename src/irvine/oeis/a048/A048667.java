package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a151.A151832;

/**
 * A048667 Number of rooted 6-dimensional "polycubes" with n cells, with no symmetries removed.
 * @author Sean A. Irvine
 */
public class A048667 extends A151832 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}
