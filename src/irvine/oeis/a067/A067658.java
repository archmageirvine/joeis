package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067658 Odd integers k such that k = gcd(((k-1)/2)!+1, ((k-1)/2)^((k-1)/2)+1).
 * @author Sean A. Irvine
 */
public class A067658 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      final Z t = Z.valueOf(2 * mN + 1);
      if (mF.add(1).gcd(Z.valueOf(mN).pow(mN).add(1)).equals(t)) {
        return t;
      }
    }
  }
}
