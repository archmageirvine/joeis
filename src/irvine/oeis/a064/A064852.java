package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a047.A047916;

/**
 * A064852 Number of orbits in A002619 consisting of n permutations.
 * @author Sean A. Irvine
 */
public class A064852 extends A047916 {

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(t(mN, mN / d).multiply(Functions.MOBIUS.i((long) d)));
    }
    return sum.divide((long) mN * mN);
  }
}
