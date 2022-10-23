package irvine.oeis.a052;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052885 E.g.f. A(x) is inverse to F(x) = x*exp(-x)/(1+x).
 * @author Sean A. Irvine
 */
public class A052885 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    Z nk = Z.valueOf(mN).pow(mN);
    for (int k = 0; k < mN; ++k) {
      nk = nk.divide(mN);
      sum = sum.add(mF.factorial(mN - 1).divide(mF.factorial(mN - k - 1)).multiply(Binomial.binomial(mN, k)).multiply(nk));
    }
    return sum;
  }
}
