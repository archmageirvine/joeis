package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067507 Powers of 2 with even digit sum.
 * @author Georg Fischer
 */
public class A067507 extends Sequence1 {

  private final int mBase = 2;
  private Z mPow = Z.ONE;

  @Override
  public Z next() {
    mPow = mPow.multiply(mBase);
    while ((Functions.DIGIT_SUM.l(mPow) & 1) != 0) {
      mPow = mPow.multiply(mBase);
    }
    return mPow;
  }
}
