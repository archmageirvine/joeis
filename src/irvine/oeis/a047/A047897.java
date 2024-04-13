package irvine.oeis.a047;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047897 a(1) = 5; for n &gt; 0, a(n+1) = a(n) * sum of digits of a(n).
 * @author Sean A. Irvine
 */
public class A047897 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : mA.multiply(Functions.DIGIT_SUM.l(mA));
    return mA;
  }
}
