package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064968 Numbers k such that 1000000000k+1, 1000000000k+3, 1000000000k+7, 1000000000k+9 are all primes.
 * @author Sean A. Irvine
 */
public class A064968 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.multiply(1000000000);
      if (s.add(1).isProbablePrime() && s.add(3).isProbablePrime() && s.add(7).isProbablePrime() && s.add(9).isProbablePrime()) {
        return mN;
      }
    }
  }
}
