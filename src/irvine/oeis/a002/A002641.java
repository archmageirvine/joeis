package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002641 Numbers k such that (k^2 + k + 1)/7 is prime.
 * @author Sean A. Irvine
 */
public class A002641 extends Sequence1 {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final long m = mN.mod(7);
      if ((m == 2 || m == 4) && mN.square().add(mN).add(1).divide(7).isPrime()) {
        return mN;
      }
    }
  }
}
