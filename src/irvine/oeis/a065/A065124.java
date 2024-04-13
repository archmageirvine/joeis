package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065124 a(n) = (sum of digits of a(n-2)) + a(n-1); a(0) = 0 and a(1) = 1.
 * @author Sean A. Irvine
 */
public class A065124 extends Sequence0 {

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
      return Z.ONE;
    }
    final Z t = mB.add(Functions.DIGIT_SUM.l(mA));
    mA = mB;
    mB = t;
    return t;
  }
}

