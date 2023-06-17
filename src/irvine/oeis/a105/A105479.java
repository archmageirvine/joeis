package irvine.oeis.a105;

import irvine.math.z.BellNumbers;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A105479 a(n) = C(n,2)*Bell(n-2) (cf. A000217, A000110).
 * a(n) = binomial(n-1, 2)*Bell(n-3), the case r = 2 of the general case of r pairs: c(n, r) = binomial(n-1, r)B(n-r-1).
 * @author Georg Fischer
 */
public class A105479 extends AbstractSequence {

  protected int mN;
  protected int mDecr;
  protected int mR;

  /** Construct the sequence. */
  public A105479() {
    this(0, 1, 2);
    next();
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param decr decrement for mN
   * @param r parameter
   */
  public A105479(final int offset, final int decr, final int r) {
    super(0);
    mN = offset - 1;
    mDecr = decr;
    mR = r;
  }

  @Override
  public Z next() {
    ++mN;
    return mN - mR <= 0 ? Z.ZERO : Binomial.binomial(mN - mDecr, mR).multiply(BellNumbers.bell(mN - mR - 1));
  }
}
