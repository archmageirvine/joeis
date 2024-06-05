package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036553 a(n) = phi(prime(n)) - prime(phi(n)).
 * @author Sean A. Irvine
 */
public class A036553 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Functions.PHI.z(Functions.PRIME.l(++mN)).subtract(Functions.PRIME.l(Functions.PHI.l(mN)));
  }
}
