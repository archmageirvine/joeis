package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062096 a(1) = 2; for n &gt; 1, a(n) is smallest number, greater than a(n-1), which is relatively prime to the sum of all previous terms.
 * @author Sean A. Irvine
 */
public class A062096 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      do {
        mA = mA.add(1);
      } while (!Z.ONE.equals(mA.gcd(mSum)));
    }
    mSum = mSum.add(mA);
    return mA;
  }
}
