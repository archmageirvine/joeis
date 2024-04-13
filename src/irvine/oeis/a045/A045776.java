package irvine.oeis.a045;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045776 a(n+1) is smallest multiple of (sum of digits of a(n)) which is &gt; a(n).
 * @author Sean A. Irvine
 */
public class A045776 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final long s = Functions.DIGIT_SUM.l(mA);
      mA = mA.divide(s).add(1).multiply(s);
    }
    return mA;
  }
}
