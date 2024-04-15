package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059269 Numbers m for which the number of divisors, tau(m), is divisible by 3.
 * @author Sean A. Irvine
 */
public class A059269 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA0.z(++mN).mod(3) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
