package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028870 Numbers k such that k^2 - 2 is prime.
 * @author Sean A. Irvine
 */
public class A028870 implements Sequence {

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
