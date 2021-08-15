package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006316 Numbers k such that k^64 + 1 is prime.
 * @author Sean A. Irvine
 */
public class A006316 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.pow(64).add(1).isProbablePrime()) {
        return mN;
      }
    }
  }
}

