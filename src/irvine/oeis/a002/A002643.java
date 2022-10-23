package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002643 Numbers k such that (k^2 + k + 1)/19 is prime.
 * @author Sean A. Irvine
 */
public class A002643 extends Sequence1 {

  private Z mN = Z.SIX;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final long m = mN.mod(19);
      if ((m == 7 || m == 11) && mN.square().add(mN).add(1).divide(19).isPrime()) {
        return mN;
      }
    }
  }
}
