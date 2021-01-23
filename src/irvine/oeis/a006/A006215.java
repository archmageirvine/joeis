package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000111;

/**
 * A006215 Number of down-up permutations of n+6 starting with n+1.
 * @author Sean A. Irvine
 */
public class A006215 extends A000111 {

  {
    super.next();
    super.next();
    super.next();
    super.next();
  }

  private int mN = -1;

  @Override
  public Z next() {
    super.next();
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < 1 + (mN + 1) / 2; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN, 2 * k + 1).multiply(mA.get(mN + 4 - 2 * k)));
    }
    return sum;
  }
}
