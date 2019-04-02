package irvine.oeis.a007;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007114 Expansion of e.g.f. (1 - x)^x.
 * @author Sean A. Irvine
 */
public class A007114 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Stirling.firstKind(k, mN - k).multiply(mF.factorial(mN).divide(mF.factorial(k))));
    }
    return sum;
  }
}
