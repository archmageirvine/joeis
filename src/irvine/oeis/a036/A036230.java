package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036230 a(n+1) = a(n) + sum of digits of a(n) starting with 110.
 * @author Sean A. Irvine
 */
public class A036230 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(110) : mA.add(Functions.DIGIT_SUM.l(mA));
    return mA;
  }
}

