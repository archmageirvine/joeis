package irvine.oeis.a008;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008969 Triangle of differences of reciprocals of unity.
 * @author Sean A. Irvine
 */
public class A008969 extends Sequence1 {

  // After Alois P. Heinz

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;

  private Z t(final Integer n, final Integer k) {
    if (k > n) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    final Z a = Functions.FACTORIAL.z(n - k + 2).pow(k);
    for (int j = 1; j <= n - k + 2; ++j) {
      sum = sum.signedAdd((j & 1) == 1, a.multiply(Binomial.binomial(n - k + 2, j)).divide(Z.valueOf(j).pow(k)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
