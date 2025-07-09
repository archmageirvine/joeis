package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078652 a(1)=1, a(2n)=nextprime(a(n-1)), a(2n+1)= sum of digits of all previous terms + 1.
 * @author Sean A. Irvine
 */
public class A078652 extends Sequence1 {

  private Z mA = null;
  private Z mDigitSum = Z.ZERO;
  private boolean mEven = true;

  @Override
  public Z next() {
    mEven = !mEven;
    if (mEven) {
      mA = Functions.NEXT_PRIME.z(mA);
    } else {
      mA = mDigitSum.add(1);
    }
    mDigitSum = mDigitSum.add(Functions.DIGIT_SUM.l(mA));
    return mA;
  }
}
