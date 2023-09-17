package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065803 a(n) = (sigma_2(n) mod 2) * (sigma_2(n) mod 5). Residue-product modulo 2 and 5 of sum of square of divisors.
 * @author Sean A. Irvine
 */
public class A065803 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z s2 = Jaguar.factor(++mN).sigma2();
    return s2.mod(Z.FIVE).multiply(s2.mod(2));
  }
}
