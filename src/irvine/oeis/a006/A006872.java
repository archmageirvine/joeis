package irvine.oeis.a006;

import irvine.math.function.Functions;
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
      if (Functions.PHI.z(mN).equals(Functions.PHI.z(Functions.SIGMA.z(mN)))) {
        return mN;
      }
    }
  }
}

