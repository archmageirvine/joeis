package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027754 Numbers k such that k^2 + k + 5 is prime.
 * @author Sean A. Irvine
 */
public class A027754 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().add(mN).add(5).isProbablePrime()) {
        return mN;
      }
    }
  }
}
