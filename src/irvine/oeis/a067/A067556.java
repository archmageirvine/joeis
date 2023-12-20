package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067556 Terms in the decimal expansion of 1/(7*2^n) before the block of decimals 142857 (the period of 1/7) appears.
 * @author Sean A. Irvine
 */
public class A067556 extends Sequence1 {

  private static final long[] TENS = {1, 10, 100, 1000, 10000, 100000};
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(5);
    return mF.multiply(TENS[++mN % TENS.length]).subtract(1).divide(7);
  }
}
