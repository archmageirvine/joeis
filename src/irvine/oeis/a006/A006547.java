package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006547.
 * @author Sean A. Irvine
 */
public class A006547 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      if (k > 1) {
        f = f.multiply(2 * k - 1).multiply(2 * k - 2);
      }
      sum = sum.signedAdd((k & 1) != 0, Binomial.binomial(mN, k).multiply(f).shiftLeft(k));
    }
    return sum;
  }
}
