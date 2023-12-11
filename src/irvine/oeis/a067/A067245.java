package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067245 Numbers k such that phi(k) divides (sigma(k+2) + sigma(k-2)).
 * @author Sean A. Irvine
 */
public class A067245 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(mN++ - 1).sigma().add(Jaguar.factor(mN + 2).sigma()).mod(Euler.phi(mN)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

