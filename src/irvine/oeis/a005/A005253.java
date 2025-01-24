package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005253 Number of binary words of length n in which the ones occur only in blocks of length at least 4.
 * @author Sean A. Irvine
 */
public class A005253 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 5; ++k) {
      sum = sum.add(Binomial.binomial(mN - 3 * k, 2 * k));
    }
    return sum;
  }
}

