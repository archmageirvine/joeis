package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A069207 Numbers n such that n^2 + (reversal of n)^2 is prime. Ignore leading 0's.
 * @author Sean A. Irvine
 */
public class A069207 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().add(ZUtils.reverse(mN).square()).isProbablePrime()) {
        return mN;
      }
    }
  }
}

