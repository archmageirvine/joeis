package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069573 extends Sequence1 {

  private static final int[] DIGIT = {0, 9, 8, 9, 8, 5, 6, 7, 8, 9};
  private long mN = 0;
  private Z mA = Z.ZERO;
  private Z mM = Z.ONE;

  private int getDigit(final long n) {
    if (n < 10) {
      return DIGIT[(int) n];
    }
    for (int k = 9; true; --k) {
      if (n % k == 0) {
        return k;
      }
    }
  }

  @Override
  public Z next() {
    mA = mA.add(mM.multiply(getDigit(++mN)));
    mM = mM.multiply(10);
    return mA;
  }
}
