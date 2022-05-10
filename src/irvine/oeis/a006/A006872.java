package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006872 Numbers k such that phi(k) = phi(sigma(k)).
 * @author Sean A. Irvine
 */
public class A006872 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Euler.phi(mN).equals(Euler.phi(Cheetah.factor(mN).sigma()))) {
        return mN;
      }
    }
  }
}

