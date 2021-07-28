package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028885 Numbers k such that k^2 - 8 is prime.
 * @author Sean A. Irvine
 */
public class A028885 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().subtract(8).isProbablePrime()) {
        return mN;
      }
    }
  }
}
