package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067663 Sequence gives values of gcd(k!+1, k^k-1) when not equal to 1 in order of appearance.
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
