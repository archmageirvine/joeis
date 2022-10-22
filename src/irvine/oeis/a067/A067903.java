package irvine.oeis.a067;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A067903 Primes of the form floor((10/9)^k).
 * @author Georg Fischer
 */
public class A067903 extends AbstractSequence {

  private final Q mFract; // fraction num/den
  private Q mProd; // accumulated power of mFract
  private Z mPrev; // previous a(n)

  /** Construct the sequence. */
  public A067903() {
    this(1, 10, 9);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param num numerator
   * @param den denominator
   */
  public A067903(final int offset, final int num, final int den) {
    super(offset);
    mFract = new Q(num, den);
    mProd = Q.ONE;
    mPrev = Z.ONE;
  }

  @Override
  public Z next() {
    while (true) {
      mProd = mProd.multiply(mFract);
      final Z result = mProd.floor();
      if (mPrev.compareTo(result) < 0 && result.isProbablePrime()) {
        mPrev = result;
        return result;
      }
    }
  }
}
