package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064964 100000n+1, 100000n+3, 100000n+7, 100000n+9 are all primes.
 * @author Sean A. Irvine
 */
public class A064964 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.multiply(100000);
      if (s.add(1).isProbablePrime() && s.add(3).isProbablePrime() && s.add(7).isProbablePrime() && s.add(9).isProbablePrime()) {
        return mN;
      }
    }
  }
}
