package irvine.oeis.a052;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052865 E.g.f.: log(-1/(-1+x))^2 / (-1 + log(-1/(-1+x)))^2.
 * @author Sean A. Irvine
 */
public class A052865 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.signedAdd(((mN - k) & 1) == 0, mF.factorial(k).multiply(k - 1).multiply(Stirling.firstKind(mN, k)));
    }
    return sum;
  }
}
