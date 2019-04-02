package irvine.oeis.a007;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007113 Expansion of e.g.f. (1 + x)^x.
 * @author Sean A. Irvine
 */
public class A007113 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(mF.factorial(k)).multiply(Stirling.firstKind(mN - k, k)));
    }
    return sum;
  }
}
