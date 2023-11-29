package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a008.A008472;

/**
 * A067001.
 * @author Sean A. Irvine
 */
public class A067008 extends A008472 {

  private Z mSum = super.next();
  private Z mF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      mSum = mSum.add(super.next());
      if (mF.mod(mSum).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
