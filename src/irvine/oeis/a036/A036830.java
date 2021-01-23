package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036830 Schoenheim bound L_1(n,n-4,n-5).
 * @author Sean A. Irvine
 */
public class A036830 implements Sequence {

  private Z mA = Z.THREE;
  private long mN = 5;

  @Override
  public Z next() {
    if (++mN > 6) {
      mA = mA.multiply(mN).add(mN - 5).divide(mN - 4);
    }
    return mA;
  }
}
