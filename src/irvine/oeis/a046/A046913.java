package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046913 Sum of divisors of n not congruent to 0 mod 3.
 * @author Sean A. Irvine
 */
public class A046913 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.SIGMA.z(3 * ++mN).subtract(Functions.SIGMA.z(mN).multiply(3));
  }
}
