package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059417 Start with 1; square; add 2; subtract 1; repeat.
 * @author Sean A. Irvine
 */
public class A059417 extends Sequence0 {

  private Z mA = null;
  private int mN = -1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      if (++mN == 3) {
        mN = 0;
      }
      switch (mN) {
        case 0:
          mA = mA.square();
          break;
        case 1:
          mA = mA.add(2);
          break;
        case 2:
        default:
          mA = mA.subtract(1);
          break;
      }
    }
    return mA;
  }
}
