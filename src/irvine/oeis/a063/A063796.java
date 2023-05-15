package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
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
      if (Euler.phi(Jaguar.factor(mN.pow(3)).sigma()).isSquare()) {
        return mN;
      }
    }
  }
}
