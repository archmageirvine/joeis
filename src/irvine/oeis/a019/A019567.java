package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A019567 Order of the Mongean shuffle permutation of 2n cards: a(n) is least number m for which either 2^m + 1 or 2^m - 1 is divisible by 4n + 1.
 * @author Sean A. Irvine
 */
public class A019567 extends Sequence0 {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(4);
    Z m = Z.ZERO;
    while (true) {
      m = m.add(1);
      final Z mod = Z.TWO.modPow(m, mN);
      if (mod.equals(Z.ONE) || mod.equals(mN.subtract(1))) {
        return m;
      }
    }
  }
}
