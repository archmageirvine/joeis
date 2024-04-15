package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051464 Number of divisors of 4*(2^n-1) + 1.
 * @author Sean A. Irvine
 */
public class A051464 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Functions.SIGMA0.z(Z.ONE.shiftLeft(++mN).subtract(1).shiftLeft(2).add(1));
  }
}
