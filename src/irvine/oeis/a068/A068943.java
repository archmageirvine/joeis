package irvine.oeis.a068;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A068943 a(n) = f(n, n, n), where f is the generalized super falling factorial (see comments for definition.).
 * @author Sean A. Irvine
 */
public class A068943 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A068943(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A068943() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long m = 1; m <= mN; ++m) {
      prod = prod.multiply(Z.valueOf(mN - m + 1).pow(Binomial.binomial(m + mN - 2, m - 1)));
    }
    return prod;
  }
}

