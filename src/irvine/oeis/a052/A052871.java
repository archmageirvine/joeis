package irvine.oeis.a052;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052871 E.g.f.: -LambertW(x/(-1+x)).
 * @author Sean A. Irvine
 */
public class A052871 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(mF.factorial(mN).divide(mF.factorial(k)).multiply(Binomial.binomial(mN - 1, k - 1)).multiply(Z.valueOf(k).pow(k - 1)));
    }
    return sum;
  }
}
