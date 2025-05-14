package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A077230.
 * @author Sean A. Irvine
 */
public class A077255 extends A000040 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (super.next().modPow(mN, mN).isOne()) {
        return mN;
      }
    }
  }
}
