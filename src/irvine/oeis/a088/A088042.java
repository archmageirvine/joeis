package irvine.oeis.a088;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A088042 Number of permutations in the symmetric group S_n such that the size of their conjugacy class is odd.
 * @author Sean A. Irvine
 */
public class A088042 extends Sequence1 {

  protected final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.add(Functions.FACTORIAL.z(mN).multiply(Binomial.binomial(mN - (mN & 1), 2L * k, 2)).shiftRight(k).divide(Functions.FACTORIAL.z(k)).divide(Functions.FACTORIAL.z(mN - 2 * k)));
    }
    return sum;
  }
}
