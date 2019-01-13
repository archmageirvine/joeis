package irvine.oeis.a262;

import irvine.math.z.Z;
import irvine.oeis.a210.A210696;

/**
 * A262586.
 * @author Sean A. Irvine
 */
public class A262586 extends A210696 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return brownG(mM, mN - mM);
  }

}

