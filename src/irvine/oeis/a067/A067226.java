package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067226 Numbers k such that phi(5k+1) = sigma(k).
 * @author Sean A. Irvine
 */
public class A067226 extends Sequence1 {

  private long mN = 5004;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma().equals(Euler.phi(5 * mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
