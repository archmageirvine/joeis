package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006872 Numbers k such that phi(k) = phi(sigma(k)).
 * @author Sean A. Irvine
 */
public class A006872 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Euler.phi(mN).equals(Euler.phi(Jaguar.factor(mN).sigma()))) {
        return mN;
      }
    }
  }
}

