package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036228 a(1) = 31; a(n+1) = a(n) + sum of decimal digits of a(n).
 * @author Sean A. Irvine
 */
public class A036228 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(31) : mA.add(Functions.DIGIT_SUM.l(mA));
    return mA;
  }
}

