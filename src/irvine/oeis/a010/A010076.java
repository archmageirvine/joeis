package irvine.oeis.a010;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010076 a(n) = sum of base-9 digits of a(n-1) + sum of base-9 digits of a(n-2).
 * @author Sean A. Irvine
 */
public class A010076 extends Sequence0 {

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
      final Z t = Z.valueOf(Functions.DIGIT_SUM.l(9, mA) + Functions.DIGIT_SUM.l(9, mB));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

