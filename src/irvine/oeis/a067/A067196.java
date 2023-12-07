package irvine.oeis.a067;

import irvine.math.Mobius;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a002.A002321;

/**
 * A067185.
 * @author Sean A. Irvine
 */
public class A067196 extends A002321 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(Mobius.mobius(Euler.phiAsLong(++mN)));
      if (mSum.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

