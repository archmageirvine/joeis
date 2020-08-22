package irvine.oeis.a007;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007121 E.g.f. ( (1+x)^x )^x.
 * @author Sean A. Irvine
 */
public class A007121 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.add(Stirling.firstKind(mN - 2 * k, k).multiply(mF.factorial(mN).divide(mF.factorial(mN - 2 * k))));
    }
    return sum;
  }
}
