package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024919 Sum_{k=1..n} (-1)^k*k*floor(n/k).
 * @author Sean A. Irvine
 */
public class A024919 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Z.valueOf(k).multiply(mN / k));
    }
    return sum;
  }
}
