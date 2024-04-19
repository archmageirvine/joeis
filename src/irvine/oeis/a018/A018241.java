package irvine.oeis.a018;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A018241 Number of simple allowable sequences on 1..n.
 * @author Sean A. Irvine
 */
public class A018241 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z a = Functions.FACTORIAL.z(mN - 2).multiply(Functions.FACTORIAL.z(Binomial.binomial(mN, 2)));
    for (int k = 0; k <= mN - 2; ++k) {
      a = a.divide(Z.valueOf(2L * k + 1).pow(mN - k - 1));
    }
    return a;
  }
}
