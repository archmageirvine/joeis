package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076233 Numbers k such that sigma(k)/k and sigma_3(k)/k are both integers.
 * @author Sean A. Irvine
 */
public class A076233 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.SIGMA1.z(mN).mod(mN).isZero() && Functions.SIGMA.z(3, mN).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
