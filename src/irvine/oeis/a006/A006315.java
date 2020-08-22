package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006315 Numbers n such that n^32 + 1 is prime.
 * @author Sean A. Irvine
 */
public class A006315 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.pow(32).add(1).isProbablePrime()) {
        return mN;
      }
    }
  }
}

