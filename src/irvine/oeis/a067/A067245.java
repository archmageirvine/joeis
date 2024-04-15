package irvine.oeis.a067;

import irvine.math.function.Functions;
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
      if (Functions.SIGMA.z(mN++ - 1).add(Functions.SIGMA.z(mN + 2)).mod(Euler.phi(mN)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

