package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006313 Numbers n such that n^16 + 1 is prime.
 * @author Sean A. Irvine
 */
public class A006313 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.pow(16).add(1).isProbablePrime()) {
        return mN;
      }
    }
  }
}

