package irvine.oeis.a213;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A213441.
 * @author Sean A. Irvine
 */
public class A213441 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    ++mN;
    for (int k = 1; k < mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).shiftLeft(k * (mN - k)));
    }
    return sum;
  }
}

