package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024922 <code>a(n) =</code> sum of <code>[ (n/k)*[ (n/k)*[ n/k ] ] ], k = 1,2,3,...,n</code>.
 * @author Sean A. Irvine
 */
public class A024922 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      final Z zn = Z.valueOf(mN);
      sum = sum.add(zn.multiply(zn.multiply(mN / k).divide(k)).divide(k));
    }
    return sum;
  }
}
