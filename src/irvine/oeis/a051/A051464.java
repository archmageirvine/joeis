package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051464 Number of divisors of 4*(2^n-1) + 1.
 * @author Sean A. Irvine
 */
public class A051464 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(Z.ONE.shiftLeft(++mN).subtract(1).shiftLeft(2).add(1)).sigma0();
  }
}
