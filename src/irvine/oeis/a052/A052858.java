package irvine.oeis.a052;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052858 E.g.f.: log(-1/(-1+x*exp(x)-x)).
 * @author Sean A. Irvine
 */
public class A052858 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN / 2; ++k) {
      sum = sum.add(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mN - k)).multiply(Stirling.secondKind(mN - k, k).multiply(Functions.FACTORIAL.z(k - 1))));
    }
    return sum;
  }
}

