package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028873 Numbers k such that k^2 - 3 is prime.
 * @author Sean A. Irvine
 */
public class A028873 extends Sequence1 {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().subtract(3).isProbablePrime()) {
        return mN;
      }
    }
  }
}
