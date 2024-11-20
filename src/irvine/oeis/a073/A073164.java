package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A073161.
 * @author Sean A. Irvine
 */
public class A073164 extends A000720 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(super.next());
      if (mSum.mod(++mN) == 0) {
        return mSum.divide(mN);
      }
    }
  }
}
