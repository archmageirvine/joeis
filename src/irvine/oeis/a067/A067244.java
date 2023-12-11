package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067244 Numbers k such that phi(k) divides (sigma(k+1) + sigma(k-1)).
 * @author Sean A. Irvine
 */
public class A067244 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(mN++).sigma().add(Jaguar.factor(mN + 1).sigma()).mod(Euler.phi(mN)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

