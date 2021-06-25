package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a151.A151833;

/**
 * A048668 Number of rooted 7-dimensional "polycubes" with n cells, with no symmetries removed.
 * @author Sean A. Irvine
 */
public class A048668 extends A151833 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}
