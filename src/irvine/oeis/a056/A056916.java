package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056916 Product of the orders of the elements in a cyclic group with n elements.
 * @author Sean A. Irvine
 */
public class A056916 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      prod = prod.multiply(d.pow(Functions.PHI.z(d)));
    }
    return prod;
  }
}
