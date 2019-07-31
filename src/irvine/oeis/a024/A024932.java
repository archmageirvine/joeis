package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024932 <code>a(n) =</code> sum of <code>k*[ (n/k)*[ n/k ] ], k = 1,2,3,...,n</code>.
 * @author Sean A. Irvine
 */
public class A024932 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(mN / k).multiply(mN).divide(k).multiply(k));
    }
    return sum;
  }
}
