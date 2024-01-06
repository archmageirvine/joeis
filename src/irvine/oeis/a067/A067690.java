package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067690 gcd((2n)!+1, n!+1) when not equal to 1.
 * @author Sean A. Irvine
 */
public class A067690 extends Sequence1 {

  private Z mF = Z.ONE;
  private Z mF2 = Z.TWO;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      mF2 = mF2.multiply(2 * mN).multiply(2 * mN - 1);
      final Z d = mF2.add(1).gcd(mF.add(1));
      if (!d.equals(Z.ONE)) {
        return d;
      }
    }
  }
}
