package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a269.A269920;

/**
 * A006299 Number of rooted genus-2 maps with n edges.
 * @author Sean A. Irvine
 */
public class A006299 extends A269920 {

  private int mN = 3;

  @Override
  public Z next() {
    return get(++mN, 2, (mN - 1) / 2);
  }
}
