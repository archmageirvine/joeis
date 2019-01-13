package irvine.oeis.a008;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008270.
 * @author Sean A. Irvine
 */
public class A008270 implements Sequence {

  protected final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(Binomial.binomial(mN - 1, k).multiply(2 * k + 1).multiply(mF.factorial(2 * k + 1)).shiftRight(k));
    }
    return sum.multiply(mN);
  }
}

