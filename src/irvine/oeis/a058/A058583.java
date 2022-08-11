package irvine.oeis.a058;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058583 Max_{k=0..n} k!*|Stirling1(n,k)|.
 * @author Sean A. Irvine
 */
public class A058583 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      max = max.max(MemoryFactorial.SINGLETON.factorial(k).multiply(Stirling.firstKind(mN, k).abs()));
    }
    return max;
  }
}
