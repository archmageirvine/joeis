package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068682 Numbers k such that the concatenations k, k-2, k and k, k+2, k are primes.
 * @author Sean A. Irvine
 */
public class A068682 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(++mN);
      if (new Z(s + (mN - 2) + s).isProbablePrime() && new Z(s + (mN + 2) + s).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
