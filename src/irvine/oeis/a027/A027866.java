package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027866 Numbers k such that k^2 + (k+1)^2 + (k+2)^2 + (k+3)^2 + (k+4)^2 + (k+5)^2 is prime.
 * @author Sean A. Irvine
 */
public class A027866 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().add(mN.add(1).square()).add(mN.add(2).square()).add(mN.add(3).square()).add(mN.add(4).square()).add(mN.add(5).square()).isProbablePrime()) {
        return mN;
      }
    }
  }
}
