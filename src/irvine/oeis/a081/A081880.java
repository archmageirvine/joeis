package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081880 Triangle read by rows: n-th row gives trajectory of 2n under the map x-&gt;(x^2-4)/6, stopping when the next term would be negative or nonintegral.
 * @author Sean A. Irvine
 */
public class A081880 extends Sequence0 {

  private long mN = -1;
  private Z mM = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mM.square().subtract(4);
    if (t.signum() < 0 || t.mod(6) != 0) {
      mM = Z.valueOf(2 * ++mN);
    } else {
      mM = t.divide(6);
    }
    return mM;
  }
}
