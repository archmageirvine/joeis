package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027757 Numbers k such that k^2 + k + 9 is prime.
 * @author Sean A. Irvine
 */
public class A027757 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().add(mN).add(9).isProbablePrime()) {
        return mN;
      }
    }
  }
}
