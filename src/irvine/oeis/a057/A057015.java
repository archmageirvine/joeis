package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057015 Numbers k such that k^2 + 1, k^2 + 3, k^2 + 7 and k^2 + 9 are all primes.
 * @author Sean A. Irvine
 */
public class A057015 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z n2 = Z.valueOf(++mN).square();
      if (n2.add(1).isProbablePrime() && n2.add(3).isProbablePrime() && n2.add(7).isProbablePrime() && n2.add(9).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
