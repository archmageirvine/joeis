package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057686 Trajectory of 23 under the `23x+1' map.
 * @author Sean A. Irvine
 */
public class A057686 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 23;
    } else if ((mN & 1) == 0) {
      mN /= 2;
    } else if (mN % 3 == 0) {
      mN /= 3;
    } else if (mN % 5 == 0) {
      mN /= 5;
    } else if (mN % 7 == 0) {
      mN /= 7;
    } else if (mN % 11 == 0) {
      mN /= 11;
    } else if (mN % 13 == 0) {
      mN /= 13;
    } else if (mN % 17 == 0) {
      mN /= 17;
    } else if (mN % 19 == 0) {
      mN /= 19;
    } else {
      mN = mN * 23 + 1;
    }
    return Z.valueOf(mN);
  }
}
