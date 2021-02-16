package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038844 n for which 6n+1 | 2^n-1.
 * @author Sean A. Irvine
 */
public class A038844 implements Sequence {

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
