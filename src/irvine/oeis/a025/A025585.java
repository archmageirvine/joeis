package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025585 Central Eulerian numbers <code>A(2n-1,n)</code>.
 * @author Sean A. Irvine
 */
public class A025585 implements Sequence {

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
