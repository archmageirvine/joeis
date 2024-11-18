package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a051.A051953;

/**
 * A073128 Integer quotients arising in A063986.
 * @author Sean A. Irvine
 */
public class A073128 extends A051953 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(super.next());
      if (mSum.mod(mN) == 0) {
        return mSum.divide(mN);
      }
    }
  }
}
