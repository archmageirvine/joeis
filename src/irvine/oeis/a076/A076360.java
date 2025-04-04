package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076360 a(n) = d(sigma(n)) - sigma(d(n)), where d(n) is the number of divisors of n and sigma(n) is their sum.
 * @author Sean A. Irvine
 */
public class A076360 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.SIGMA0.z(Functions.SIGMA1.z(++mN)).subtract(Functions.SIGMA1.z(Functions.SIGMA0.z(mN)));
  }
}
