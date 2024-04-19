package irvine.oeis.a006;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006153 E.g.f.: 1/(1-x*exp(x)).
 * @author Sean A. Irvine
 */
public class A006153 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(k)).multiply(Z.valueOf(mN - k).pow(k)));
    }
    return sum;
  }
}

