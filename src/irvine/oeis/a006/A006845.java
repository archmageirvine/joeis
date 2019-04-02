package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a133.A133709;

/**
 * A006845 State assignments for n-state machine.
 * @author Sean A. Irvine
 */
public class A006845 extends A133709 {

  private int mN = -1;
  private int mL = 0;

  @Override
  public Z next() {
    if (mN == -1) {
      mN = 0;
      return Z.ZERO;
    }
    if (++mL >= 1 << mN) {
      ++mN;
    }
    return get(mN, mL);
  }
}
