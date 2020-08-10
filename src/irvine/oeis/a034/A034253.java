package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a076.A076832;

/**
 * A034253.
 * @author Sean A. Irvine
 */
public class A034253 extends A076832 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM).subtract(t(mN, mM - 1));
  }
}

