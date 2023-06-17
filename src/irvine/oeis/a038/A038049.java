package irvine.oeis.a038;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A038049 Number of labeled rooted trees with 2-colored leaves.
 * @author Sean A. Irvine
 */
public class A038049 extends AbstractSequence {

  /* Construct the sequence. */
  public A038049() {
    super(1);
  }

  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(Z.valueOf(mN - k).pow(mN - 1)));
    }
    return sum;
  }
}
