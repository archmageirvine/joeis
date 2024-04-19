package irvine.oeis.a052;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052868 Expansion of e.g.f. LambertW(x/(-1+x))/x*(-1+x).
 * @author Sean A. Irvine
 */
public class A052868 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(k)).multiply(Binomial.binomial(mN - 1, k - 1)).multiply(Z.valueOf(k + 1).pow(k - 1)));
    }
    return sum;
  }
}

