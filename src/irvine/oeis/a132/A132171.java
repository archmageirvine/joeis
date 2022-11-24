package irvine.oeis.a132;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A132171 3^n repeated 3^n times.
 * @author Georg Fischer
 */
public class A132171 extends Sequence0 {

  private int mCount = 1;
  private int mPow3 = 1;

  @Override
  public Z next() {
    --mCount;
    final Z result = Z.valueOf(mPow3);
    if (mCount <= 0) {
      mPow3 *= 3;
      mCount = mPow3;
    }
    return result;
  }
}
