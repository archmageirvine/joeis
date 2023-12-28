package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067615 Terms in decimal expansion of 1/(17*2^n) before 5882352941176470 (the period with no leading zeros of 1/17) appears.
 * @author Sean A. Irvine
 */
public class A067615 extends Sequence1 {

  private static final long[] TENS = {100000000000000000L, 10000000000L, 1000, 1000000000000L, 100000, 100000000000000L, 10000000, 1, 1000000000, 100, 100000000000L, 10000, 10000000000000L, 1000000, 1000000000000000L, 100000000};
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(5);
    return mF.multiply(TENS[++mN % TENS.length]).subtract(10).divide(17);
  }
}
