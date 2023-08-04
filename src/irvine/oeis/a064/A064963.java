package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064963 10000n+1, 10000n+3, 10000n+7, 10000n+9 are all primes.
 * @author Sean A. Irvine
 */
public class A064963 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.multiply(10000);
      if (s.add(1).isProbablePrime() && s.add(3).isProbablePrime() && s.add(7).isProbablePrime() && s.add(9).isProbablePrime()) {
        return mN;
      }
    }
  }
}
