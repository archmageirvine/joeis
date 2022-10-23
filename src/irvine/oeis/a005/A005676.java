package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005676 Sum C(n-k,4*k), k = 0..n.
 * @author Sean A. Irvine
 */
public class A005676 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN - k, 4 * k));
    }
    return sum;
  }
}

