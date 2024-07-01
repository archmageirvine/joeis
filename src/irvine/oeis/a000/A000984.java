package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000984 Central binomial coefficients: binomial(2*n,n) = (2*n)!/(n!)^2.
 * @author Sean A. Irvine
 */
public class A000984 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000984(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000984() {
    super(0);
  }

  private Z mV = Z.ONE;
  protected long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mV = mV.multiply(4 * mN - 2).divide(mN);
    }
    return mV;
  }

  @Override
  public Z a(final Z n) {
    return Binomial.binomial(n.multiply2(), n);
  }

  @Override
  public Z a(final int n) {
    return Binomial.binomial(2 * n, n);
  }

}

