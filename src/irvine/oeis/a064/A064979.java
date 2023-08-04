package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064979 n*10^5-1, n*10^5-3, n*10^5-7 and n*10^5-9 are all prime.
 * @author Sean A. Irvine
 */
public class A064979 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.multiply(100000);
      if (s.subtract(1).isProbablePrime() && s.subtract(3).isProbablePrime() && s.subtract(7).isProbablePrime() && s.subtract(9).isProbablePrime()) {
        return mN;
      }
    }
  }
}
