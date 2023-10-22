package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002642 Numbers k such that (k^2 + k + 1)/13 is prime.
 * @author Sean A. Irvine
 */
public class A002642 extends Sequence1 {

  private Z mN = Z.EIGHT;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final long m = mN.mod(13);
      if ((m == 3 || m == 9) && mN.square().add(mN).add(1).divide(13).isPrime()) {
        return mN;
      }
    }
  }
}
