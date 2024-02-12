package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068345 Powers of 2, the fourth-from-last digit of which equals 7.
 * @author Sean A. Irvine
 */
public class A068345 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.multiply2();
      if (mN.mod(10000) / 1000 == 7) {
        return mN;
      }
    }
  }
}

