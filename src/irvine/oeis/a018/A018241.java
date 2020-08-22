package irvine.oeis.a018;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018241 Number of simple allowable sequences on 1..n.
 * @author Sean A. Irvine
 */
public class A018241 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z a = mF.factorial(mN - 2).multiply(mF.factorial(Binomial.binomial(mN, 2).intValueExact()));
    for (int k = 0; k <= mN - 2; ++k) {
      a = a.divide(Z.valueOf(2L * k + 1).pow(mN - k - 1));
    }
    return a;
  }
}
