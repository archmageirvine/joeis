package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064962 Numbers k such that 1000k+1, 1000k+3, 1000k+7, 1000k+9 are all primes.
 * @author Sean A. Irvine
 */
public class A064962 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.multiply(1000);
      if (s.add(1).isProbablePrime() && s.add(3).isProbablePrime() && s.add(7).isProbablePrime() && s.add(9).isProbablePrime()) {
        return mN;
      }
    }
  }
}
