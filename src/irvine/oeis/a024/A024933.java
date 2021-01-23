package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024933 a(n) = Sum_{k=1..n} k*[ (n/k)*[ (n/k)*[ n/k ] ] ].
 * @author Sean A. Irvine
 */
public class A024933 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(mN / k).multiply(mN).divide(k).multiply(mN).divide(k).multiply(k));
    }
    return sum;
  }
}
