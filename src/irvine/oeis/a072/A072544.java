package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072544 Numbers whose smallest decimal digit is also the initial digit.
 * @author Sean A. Irvine
 */
public class A072544 extends Sequence1 {

  private long mN = -1;
  private long mMul = 1;
  private long mMul10 = 10;

  @Override
  public Z next() {
    while (true) {
      final int min = Functions.DIGIT_MIN.i(++mN);
      if (mN >= mMul10) {
        mMul = mMul10;
        mMul10 *= 10;
      }
      if (mN / mMul == min) {
        return Z.valueOf(mN);
      }
    }
  }
}
