package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001142 a(n) = Product_{k=1..n} k^(2k - 1 - n).
 * @author Sean A. Irvine
 */
public class A001142 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001142(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001142() {
    super(0);
  }

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z p = Z.ONE;
    for (int k = 1; k < mN; ++k) {
      p = p.multiply(Binomial.binomial(mN, k));
    }
    return p;
  }
}
