package irvine.oeis.a047;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047902 a(1) = 11; for n &gt; 0, a(n+1) = a(n) * sum of digits of a(n).
 * @author Sean A. Irvine
 */
public class A047902 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(11) : mA.multiply(Functions.DIGIT_SUM.l(mA));
    return mA;
  }
}
