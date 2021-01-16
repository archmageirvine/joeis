package irvine.oeis.a038;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038455 A Jabotinsky-triangle related to A006963.
 * @author Sean A. Irvine
 */
public class A038455 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    Z sum = Z.ZERO;
    for (int k = mM; k <= mN; ++k) {
      sum = sum.add(Stirling.firstKind(k, mM).multiply(Binomial.binomial(2 * mN, mN - k)).multiply(mF.factorial(mN - 1)).divide(mF.factorial(k - 1)));
    }
    return sum;
  }
}
