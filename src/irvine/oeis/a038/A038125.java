package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038125 a(n) = Sum_{k=0..n} (k-n)^k.
 * @author Sean A. Irvine
 */
public class A038125 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(k - mN).pow(k));
    }
    return sum;
  }
}
