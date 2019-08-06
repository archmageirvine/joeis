package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024922 <code>a(n) = Sum_{k=1..n} floor((n/k) * floor((n/k) * floor(n/k)))</code>.
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
