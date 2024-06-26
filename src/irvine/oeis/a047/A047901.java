package irvine.oeis.a047;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047901 a(1) = 9; a(n+1) = a(n) * sum of decimal digits of a(n).
 * @author Sean A. Irvine
 */
public class A047901 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.multiply(Functions.DIGIT_SUM.l(mA));
    return mA;
  }
}
