package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A001690.
 * @author Sean A. Irvine
 */
public class A001690 extends A000045 {

  {
    super.next();
    super.next();
  }

  private Z mF = super.next();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    while (mN.compareTo(mF) >= 0) {
      mF = super.next();
      mN = mN.add(1);
    }
    return mN;
  }
}
