package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076230 Numbers k such that sigma_2(k)/k and sigma_4(k)/k are integers.
 * @author Sean A. Irvine
 */
public class A076230 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.SIGMA.z(2, mN).mod(mN).isZero() && Functions.SIGMA.z(4, mN).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
