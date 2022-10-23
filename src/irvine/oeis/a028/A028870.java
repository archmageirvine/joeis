package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028870 Numbers k such that k^2 - 2 is prime.
 * @author Sean A. Irvine
 */
public class A028870 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().subtract(2).isProbablePrime()) {
        return mN;
      }
    }
  }
}
