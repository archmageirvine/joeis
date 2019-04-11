package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005676 Sum C(n-k,4*k), <code>k = 0..n</code>.
 * @author Sean A. Irvine
 */
public class A005676 implements Sequence {

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

