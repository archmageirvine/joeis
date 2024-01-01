package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067633.
 * @author Sean A. Irvine
 */
public class A067663 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      final Z d = mF.add(1).gcd(Z.valueOf(mN).pow(mN).subtract(1));
      if (!d.equals(Z.ONE)) {
        return d;
      }
    }
  }
}
