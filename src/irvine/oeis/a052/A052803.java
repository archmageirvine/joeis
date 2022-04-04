package irvine.oeis.a052;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052803 E.g.f.: (-1 + sqrt(1 + 4*log(1-x)))/(2*log(1-x)).
 * @author Sean A. Irvine
 */
public class A052803 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Stirling.firstKind(mN, k).abs().multiply(mF.factorial(2 * k)).divide(mF.factorial(k + 1)));
    }
    return sum;
  }
}
