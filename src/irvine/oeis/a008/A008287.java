package irvine.oeis.a008;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A008287 Triangle of quadrinomial coefficients, row n is the sequence of coefficients of (1 + x + x^2 + x^3)^n.
 * @author Sean A. Irvine
 */
public class A008287 extends AbstractSequence {

  /* Construct the sequence. */
  public A008287() {
    super(0);
  }

  protected Z quadrinomial(final long n, final long k) {
    Z sum = Z.ZERO;
    for (long i = 0; i <= k / 2; ++i) {
      sum = sum.add(Binomial.binomial(n, i).multiply(Binomial.binomial(n, k - 2 * i)));
    }
    return sum;
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > 3 * mN) {
      ++mN;
      mM = 0;
    }
    return quadrinomial(mN, mM);
  }
}

