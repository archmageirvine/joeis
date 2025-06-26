package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385122 a(n) = d(phi(n)) - phi(d(n)) where d(n) = A000005(n) is the number of divisors and phi(n) = A000010(n) is the Euler totient function.
 * @author Sean A. Irvine
 */
public class A385122 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.SIGMA0.z(Functions.PHI.l(++mN)).subtract(Functions.PHI.z(Functions.SIGMA0.l(mN)));
  }
}
