package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A064867 The minimal number which has multiplicative persistence 3 in base n.
 * @author Sean A. Irvine
 */
public class A064867 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.valueOf(26);
    } else if (mN == 4) {
      return Z.valueOf(63);
    } else if (mN == 5) {
      return Z.valueOf(68);
    } else {
      return Z.valueOf(4L * mN - mN / 6);
    }
  }
}

