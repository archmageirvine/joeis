package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069934 a(n) = lcm_{d|n} sigma(d).
 * @author Sean A. Irvine
 */
public class A069934 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z lcm = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      lcm = lcm.lcm(Functions.SIGMA.z(d));
    }
    return lcm;
  }
}
