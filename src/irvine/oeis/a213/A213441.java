package irvine.oeis.a213;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A213441 Number of 2-colored graphs on n labeled nodes.
 * @author Sean A. Irvine
 */
public class A213441 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    ++mN;
    for (int k = 1; k < mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).shiftLeft((long) k * (mN - k)));
    }
    return sum;
  }
}

