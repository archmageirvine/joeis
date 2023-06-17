package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005324 Column of Motzkin triangle A026300.
 * @author Sean A. Irvine
 */
public class A005324 extends AbstractSequence {

  /* Construct the sequence. */
  public A005324() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = (mN - 3) / 2; k <= mN + 1; ++k) {
      sum = sum.add(Binomial.binomial(k, 2 * k - mN + 4).multiply(Binomial.binomial(mN + 1, k)));
    }
    return sum.multiply(5).divide(mN + 1);
  }
}

