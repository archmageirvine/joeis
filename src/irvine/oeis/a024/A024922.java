package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024922 a(n) = Sum_{k=1..n} floor((n/k) * floor((n/k) * floor(n/k))).
 * @author Sean A. Irvine
 */
public class A024922 extends Sequence1 {

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
