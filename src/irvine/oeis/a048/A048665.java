package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a151.A151830;

/**
 * A048665 Number of rooted 4-dimensional "polycubes" with n cells, with no symmetries removed.
 * @author Sean A. Irvine
 */
public class A048665 extends A151830 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}
