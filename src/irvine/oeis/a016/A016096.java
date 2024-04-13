package irvine.oeis.a016;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016096 a(n+1) = a(n) + sum of its digits, with a(1) = 9.
 * @author Sean A. Irvine
 */
public class A016096 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.add(Functions.DIGIT_SUM.l(mA));
    return mA;
  }
}
