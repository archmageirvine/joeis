package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067703 Terms in the decimal expansion of 1/(7*5^n) before the block of decimals 142857 (the period of 1/7) appears.
 * @author Sean A. Irvine
 */
public class A067703 extends Sequence1 {

  private static final long[] TENS = {1, 10000, 100};
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(2);
    return mF.multiply(TENS[++mN % TENS.length]).subtract(1).divide(7);
  }
}
