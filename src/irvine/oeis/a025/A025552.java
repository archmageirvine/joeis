package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a003.A003814;

/**
 * A025552.
 * @author Sean A. Irvine
 */
public class A025552 extends A003814 {

  // todo not yet right

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final boolean s = (mN & (mN - 1)) == 0 || ((mN - 1) & (mN - 2)) == 0;
    return super.next().divide(s ? 2 : 1);
  }
}
