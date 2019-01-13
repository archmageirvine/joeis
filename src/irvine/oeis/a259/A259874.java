package irvine.oeis.a259;

import irvine.math.z.Z;
import irvine.oeis.a002.A002004;

/**
 * A259874.
 * @author Sean A. Irvine
 */
public class A259874 extends A002004 {

  private int mN = 0;
  private int mD = 0;

  @Override
  public Z next() {
    if (++mD > mN) {
      ++mN;
      mD = 1;
    }
    return Z.valueOf(davenportSchinzel(mD, mN - mD + 1));
  }
}
