package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068423 Numbers k such that sigma(k) = 2*phi(k+1).
 * @author Sean A. Irvine
 */
public class A068423 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(++mN).equals(Euler.phi(mN + 1).multiply2())) {
        return Z.valueOf(mN);
      }
    }
  }
}

