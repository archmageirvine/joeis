package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006575 Number of primitive (aperiodic, or Lyndon) asymmetric rhythm cycles: ones having no nontrivial shift automorphism.
 * @author Sean A. Irvine
 */
public class A006575 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      if ((d & 1) == 1) {
        sum = sum.add(Z.THREE.pow(mN / d).subtract(1).multiply(Functions.MOBIUS.i(d)));
      }
    }
    return sum.divide(2L * mN);
  }
}
