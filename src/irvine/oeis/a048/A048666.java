package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a151.A151831;

/**
 * A048666 Number of rooted 5-dimensional "polycubes" with n cells, with no symmetries removed.
 * @author Sean A. Irvine
 */
public class A048666 extends A151831 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}
