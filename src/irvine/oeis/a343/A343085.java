package irvine.oeis.a343;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A343085 a(n) is the smallest number that is the sum of n positive cubes in four ways.
 * @author Sean A. Irvine
 */
public class A343085 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.valueOf(13896);
    } else if (mN == 4) {
      return Z.valueOf(1979);
    } else if (mN == 5) {
      return Z.valueOf(1252);
    } else if (mN == 6) {
      return Z.valueOf(626);
    } else if (mN == 7) {
      return Z.valueOf(470);
    } else if (mN == 8) {
      return Z.valueOf(256);
    } else if (mN <= 12) {
      return Z.valueOf(mN + 215);
    } else if (mN <= 15) {
      return Z.valueOf(mN + 208);
    } else if (mN <= 18) {
      return Z.valueOf(mN + 187);
    } else {
      return Z.valueOf(mN + 152);
    }
  }
}
