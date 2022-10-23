package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028879 Numbers k such that k^2 - 6 is prime.
 * @author Sean A. Irvine
 */
public class A028879 extends Sequence1 {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().subtract(6).isProbablePrime()) {
        return mN;
      }
    }
  }
}
