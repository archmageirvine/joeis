package irvine.oeis.a062;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062204.
 * @author Sean A. Irvine
 */
public class A062204 extends Sequence0 {

  // A(n, y) = sum(k=0,n*y, sum(t=0,k, (-1)^t * binomial(k,t) * binomial(k-t,y)^n )).

  private final int mY;
  protected int mN = -1;

  /**
   * Construct the sequence with given parameter.
   * @param y parameter
   */
  public A062204(final int y) {
    mY = y;
  }

  /** Construct the sequence. */
  public A062204() {
    this(7);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN * mY; ++k) {
      for (int t = 0; t <= k; ++t) {
        sum = sum.signedAdd((t & 1) == 0, Binomial.binomial(k, t).multiply(Binomial.binomial(k - t, mY).pow(mN)));
      }
    }
    return sum;
  }
}

