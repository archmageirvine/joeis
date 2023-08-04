package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064977 n*10^3-1, n*10^3-3, n*10^3-7 and n*10^3-9 are all prime.
 * @author Sean A. Irvine
 */
public class A064977 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.multiply(1000);
      if (s.subtract(1).isProbablePrime() && s.subtract(3).isProbablePrime() && s.subtract(7).isProbablePrime() && s.subtract(9).isProbablePrime()) {
        return mN;
      }
    }
  }
}
