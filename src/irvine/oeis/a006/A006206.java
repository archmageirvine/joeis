package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006206 Number of aperiodic binary necklaces of length n with no subsequence 00, excluding the necklace "0".
 * @author Sean A. Irvine
 */
public class A006206 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      s = s.add(Functions.FIBONACCI.z(d + 1).add(Functions.FIBONACCI.z(d - 1)).multiply(Functions.MOBIUS.i(mN / d)));
    }
    return s.divide(mN);
  }
}
