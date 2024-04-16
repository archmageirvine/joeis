package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064222 a(0) = 0; a(n) = DecimalDigitsSortedDecreasing(a(n-1) + 1) for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A064222 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : Functions.DIGIT_SORT_DESCENDING.z(mA.add(1));
    return mA;
  }
}
