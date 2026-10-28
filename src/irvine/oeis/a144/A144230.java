package irvine.oeis.a144;

import irvine.math.api.RationalSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A144230 Numerators of the convergents to x = 1/(x^3+1).
 * @author Georg Fischer
 */
public class A144230 extends AbstractSequence implements RationalSequence {

  private long mExpon;
  private Q mX;

  /** Construct the sequence. */
  public A144230() {
    this(0, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param expon exponent of x
   */
  public A144230(final int offset, final long expon) {
    super(offset);
    mExpon = expon;
    mX = Q.ZERO;
  }

  @Override
  public Q nextQ() {
    mX = Q.ONE.divide(mX.pow(mExpon).add(1));
    return mX;
  }

  @Override
  public Z next() {
    return nextQ().num();
  }
}
