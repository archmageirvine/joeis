package irvine.oeis.a257;

import irvine.math.z.Z;
import irvine.oeis.a078.A078847;

/**
 * A257638 Numbers n such that n-25, n-1, n+1 and n+25 are consecutive primes.
 * @author Georg Fischer
 */
public class A257638 extends A078847 {

  protected int mDist;

  /** Construct the sequence. */
  public A257638() {
    this(25);
  }

  /**
   * Generic constructor with parameter
   * @param dist distance between <code>n</code> and first prime
   */
  public A257638(final int dist) {
    super(1);
    mDist = dist;
    mGaps = new int[]{dist - 1, 2, dist - 1};
  }

  @Override
  public Z next() {
    advance();
    while (!condition()) {
      advance();
    }
    return mTerms[(mCix + mTermIx) & mMask].add(mDist);
  }

}
