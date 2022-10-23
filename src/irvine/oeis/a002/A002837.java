package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002837 Numbers k such that k^2 - k + 41 is prime.
 * @author Sean A. Irvine
 */
public class A002837 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().subtract(mN).add(41).isProbablePrime()) {
        return mN;
      }
    }
  }
}

