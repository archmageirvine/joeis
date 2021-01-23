package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036841 Smallest number k such that floor[(the number of digits in k!) / k] is greater than any j &lt; k.
 * @author Sean A. Irvine
 */
public class A036841 implements Sequence {

  private static final CR LOG10 = CR.TEN.log();
  private Z mF = Z.ONE;
  private long mN = 1;
  private long mA = -1;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      final long t = (CR.valueOf(mF).log().divide(LOG10).floor().longValueExact() + 1) / mN;
      if (t > mA) {
        mA = t;
        return Z.valueOf(mN);
      }
    }
  }
}
