package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024921 <code>a(n) =</code> sum of <code>[ (n/k)*[ n/k ] ], k = 1,2,3,...,n</code>.
 * @author Sean A. Irvine
 */
public class A024921 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(mN).multiply(mN / k).divide(k));
    }
    return sum;
  }
}
