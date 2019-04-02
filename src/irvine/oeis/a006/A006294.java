package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a269.A269920;

/**
 * A006294 Number of rooted planar maps with n edges.
 * @author Sean A. Irvine
 */
public class A006294 extends A269920 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, 0, (mN + 2) / 2);
  }
}
