package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067235.
 * @author Sean A. Irvine
 */
public class A067241 extends Sequence1 {

  private long mN = 0;
  private Z mF2 = Z.ONE;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      mF2 = mF2.multiply(2 * mN).multiply(2 * mN - 1);
      if (mF2.add(1).gcd(mF.add(1)).compareTo(Z.ONE) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

