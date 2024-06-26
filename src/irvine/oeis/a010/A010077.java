package irvine.oeis.a010;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010077 a(n) = sum of digits of a(n-1) + sum of digits of a(n-2); a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A010077 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
    } else {
      final Z t = Z.valueOf(Functions.DIGIT_SUM.l(mA) + Functions.DIGIT_SUM.l(mB));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

