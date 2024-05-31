package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058583 Max_{k=0..n} k!*|Stirling1(n,k)|.
 * @author Sean A. Irvine
 */
public class A058583 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      max = max.max(Functions.FACTORIAL.z(k).multiply(Functions.STIRLING1.z(mN, k).abs()));
    }
    return max;
  }
}
