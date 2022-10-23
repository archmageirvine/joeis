package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005225 Number of permutations of length n with equal cycles.
 * @author Sean A. Irvine
 */
public class A005225 extends Sequence1 {

  private int mN = 0;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final int dd = d.intValueExact();
      sum = sum.add(mF.factorial(mN).divide(mF.factorial(dd)).divide(Z.valueOf(mN / dd).pow(dd)));
    }
    return sum;
  }
}
