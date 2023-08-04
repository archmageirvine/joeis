package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064980 n*10^6-1, n*10^6-3, n*10^6-7 and n*10^6-9 are all prime.
 * @author Sean A. Irvine
 */
public class A064980 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.multiply(1000000);
      if (s.subtract(1).isProbablePrime() && s.subtract(3).isProbablePrime() && s.subtract(7).isProbablePrime() && s.subtract(9).isProbablePrime()) {
        return mN;
      }
    }
  }
}
