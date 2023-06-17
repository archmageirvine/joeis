package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005345 Number of elements of a free idempotent monoid on n letters.
 * @author Sean A. Irvine
 */
public class A005345 extends AbstractSequence {

  /* Construct the sequence. */
  public A005345() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 31) {
      throw new UnsupportedOperationException();
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      Z t = Binomial.binomial(mN, k);
      for (int i = 1; i <= k; ++i) {
        t = t.multiply(Z.valueOf(k - i + 1).pow(1 << i));
      }
      sum = sum.add(t);
    }
    return sum;
  }
}
