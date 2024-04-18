package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063796 Numbers k such that phi(sigma(k^3)) is a square.
 * @author Sean A. Irvine
 */
public class A063796 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.PHI.z(Functions.SIGMA.z(mN.pow(3))).isSquare()) {
        return mN;
      }
    }
  }
}
