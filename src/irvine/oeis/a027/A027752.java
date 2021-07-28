package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027752 Numbers k such that k^2 + k + 3 is prime.
 * @author Sean A. Irvine
 */
public class A027752 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().add(mN).add(3).isProbablePrime()) {
        return mN;
      }
    }
  }
}
