package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a269.A269920;

/**
 * A006297 Number of rooted <code>genus-1</code> maps with n edges.
 * @author Sean A. Irvine
 */
public class A006297 extends A269920 {

  private int mN = 1;

  @Override
  public Z next() {
    return get(++mN, 1, (mN + 1) / 2);
  }
}
