package irvine.oeis.a052;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052857 A simple grammar.
 * @author Sean A. Irvine
 */
public class A052857 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.valueOf(mN);
    }
    Z sum = Z.ZERO;
    Z nk = Z.ONE;
    for (int k = 1; k < mN; ++k) {
      nk = nk.multiply(mN);
      sum = sum.add(mF.factorial(mN - 1).divide(mF.factorial(k)).multiply(Binomial.binomial(mN - 2, k - 1)).multiply(nk));
    }
    return sum;
  }
}

