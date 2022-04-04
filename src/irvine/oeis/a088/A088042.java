package irvine.oeis.a088;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A088042 Number of permutations in the symmetric group S_n such that the size of their conjugacy class is odd.
 * @author Sean A. Irvine
 */
public class A088042 implements Sequence {

  protected final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.add(mF.factorial(mN).multiply(Binomial.binomial(mN - (mN & 1), 2L * k, 2)).shiftRight(k).divide(mF.factorial(k)).divide(mF.factorial(mN - 2 * k)));
    }
    return sum;
  }
}
