package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027995 a(n) = Sum_{k=0..2n-1} T(n,k)*T(n,k+1), T given by A027926.
 * @author Sean A. Irvine
 */
public class A027995 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long m = 0; m < 2 * mN; ++m) {
      sum = sum.add(A027926.t(mN, m).multiply(A027926.t(mN, m + 1)));
    }
    return sum;
  }
}
