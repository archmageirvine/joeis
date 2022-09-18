package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059269 Numbers m for which the number of divisors, tau(m), is divisible by 3.
 * @author Sean A. Irvine
 */
public class A059269 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma0().mod(3) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
