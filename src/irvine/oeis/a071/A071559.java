package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071559 Smallest k such that n + k and n^2 + k^2 are simultaneously primes.
 * @author Sean A. Irvine
 */
public class A071559 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z n2 = mN.square();
    long k = 0;
    while (true) {
      if (mN.add(++k).isProbablePrime() && n2.add(k * k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
