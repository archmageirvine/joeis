package irvine.oeis.a343;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A343086 a(n) is the smallest number that is the sum of n positive 4th powers in four ways.
 * @author Sean A. Irvine
 */
public class A343086 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.valueOf(5978882);
    } else if (mN == 4) {
      return Z.valueOf(236674);
    } else if (mN == 5) {
      return Z.valueOf(20995);
    } else if (mN == 6) {
      return Z.valueOf(6626);
    } else if (mN <= 8) {
      return Z.valueOf(2925);
    } else if (mN == 9) {
      return Z.valueOf(2854);
    } else if (mN <= 11) {
      return Z.valueOf(mN + 1610);
    } else if (mN <= 17) {
      return Z.valueOf(mN + 765);
    } else if (mN <= 19) {
      return Z.valueOf(mN + 510);
    } else if (mN <= 31) {
      return Z.valueOf(mN + 495);
    } else {
      return Z.valueOf(mN + 480);
    }
  }
}
