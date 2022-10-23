package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025585 Central Eulerian numbers A(2n-1,n).
 * @author Sean A. Irvine
 */
public class A025585 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Z.valueOf(mN - k).pow(2 * mN - 1).multiply(Binomial.binomial(2 * mN, k)));
    }
    return sum;
  }
}
