package irvine.oeis.a176;
// manually robots/union2 at 2023-08-23 09:55

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A176176 Numbers k such that 2^(k-1) == 4^(k-1) (mod k).
 * @author Georg Fischer
 */
public class A176176 extends Sequence1 {

  private Z mKm1 = Z.NEG_ONE;
  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mKm1 = mK;
      mK = mK.add(1);
      if (Z.TWO.modPow(mKm1, mK).equals(Z.FOUR.modPow(mKm1, mK))) {
        return mK;
      }
    }
  }
}
