package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051638 a(n) = sum_{k=0..n} (C(n,k) mod 3).
 * @author Sean A. Irvine
 */
public class A051638 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k, 3));
    }
    return sum;
  }
}
