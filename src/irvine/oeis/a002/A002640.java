package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002640 Numbers k such that (k^2 + k + 1)/3 is prime.
 * @author Sean A. Irvine
 */
public class A002640 extends Sequence1 {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().add(mN).add(1).divide(3).isPrime()) {
        return mN;
      }
    }
  }
}
