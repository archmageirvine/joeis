package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063484 Omega(n+1) = 2*Omega(n), where Omega(n) is the number of prime divisors of n (with repetition).
 * @author Sean A. Irvine
 */
public class A063484 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (2 * Jaguar.factor(++mN).bigOmega() == Jaguar.factor(mN + 1).bigOmega()) {
        return Z.valueOf(mN);
      }
    }
  }
}
