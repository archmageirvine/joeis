package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064965 1000000n+1, 1000000n+3, 1000000n+7, 1000000n+9 are all primes.
 * @author Sean A. Irvine
 */
public class A064965 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.multiply(1000000);
      if (s.add(1).isProbablePrime() && s.add(3).isProbablePrime() && s.add(7).isProbablePrime() && s.add(9).isProbablePrime()) {
        return mN;
      }
    }
  }
}
