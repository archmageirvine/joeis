package irvine.oeis.a119;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A119682 Numerator of Sum_{k=1..n} (-1)^(k+1)/k^2.
 * @author Georg Fischer
 */
public class A119682 extends AbstractSequence {

  private int mN = 0;
  private int mExpon; // exponent of k in the denominator
  private boolean mNumer; // whether to yield the numerator
  private Q mSum = Q.ZERO;

  /** Construct the sequence. */
  public A119682() {
    this(true, 2);
  }

  /**
   * Generic constructor with parameters.
   * @param expon exponent
   */
  public A119682(final boolean numer, final int expon) {
    super(1);
    mN = 0;
    mNumer = numer;
    mExpon = expon;
  }

  @Override
  public Z next() {
    ++mN;
    mSum = mSum.add(new Q(((mN & 1) == 1) ? Z.ONE : Z.NEG_ONE, Z.valueOf(mN).pow(mExpon)));
    return mNumer ? mSum.num() : mSum.den();
  }
}
