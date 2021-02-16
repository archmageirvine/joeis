package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027863 Numbers k such that k^2 + (k+1)^2 + (k+2)^2 is prime.
 * @author Sean A. Irvine
 */
public class A027863 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().add(mN.add(1).square()).add(mN.add(2).square()).isProbablePrime()) {
        return mN;
      }
    }
  }
}
