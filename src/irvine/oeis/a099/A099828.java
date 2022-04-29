package irvine.oeis.a099;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A099828 Numerator of Sum_{k=1..n} 1/k^5.
 * @author Georg Fischer
 */
public class A099828 implements Sequence {

  private int mN = 0;
  private int mExpon; // exponent of k in the denominator
  private boolean mNumer; // whether to yield the numerator
  private Q mSum = Q.ZERO;

  /** Construct the sequence. */
  public A099828() {
    this(true, 5);
  }

  /**
   * Generic constructor with parameters.
   * @param expon exponent
   */
  public A099828(final boolean numer, final int expon) {
    mN = 0;
    mNumer = numer;
    mExpon = expon;
  }

  @Override
  public Z next() {
    ++mN;
    mSum = mSum.add(new Q(Z.ONE, Z.valueOf(mN).pow(mExpon)));
    return mNumer ? mSum.num() : mSum.den();
  }
}
