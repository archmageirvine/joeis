package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005574 Numbers k such that k^2 + 1 is prime.
 * @author Sean A. Irvine
 */
public class A005574 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().add(1).isProbablePrime()) {
        return mN;
      }
    }
  }
}

