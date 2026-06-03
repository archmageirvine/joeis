package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085111 a(1) = 1; then add 1, multiply by 2, subtract 3, multiply by 4, add 5, multiply by 6, subtract 7, multiply by 8 and so on.
 * @author Sean A. Irvine
 */
public class A085111 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      switch ((int) (mN & 3)) {
        case 1:
          mA = mA.add(mN);
          break;
        case 3:
          mA = mA.subtract(mN);
          break;
        default:
          mA = mA.multiply(mN);
          break;
      }
    }
    return mA;
  }
}
