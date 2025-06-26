package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038844 Numbers k for which 6*k+1 divides 2^k-1.
 * @author Sean A. Irvine
 */
public class A038844 extends Sequence1 {

  private Z mN = Z.FOUR;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z mod = mN.multiply(6).add(1);
      if (Z.TWO.modPow(mN, mod).equals(Z.ONE)) {
        return mN;
      }
    }
  }
}
