package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002387 Least k such that H(k) &gt; n, where H(k) is the harmonic number Sum_{i=1..k} 1/i.
 * @author Sean A. Irvine
 */
public class A002387 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002387(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002387() {
    super(0);
  }

  // There is a conjectured formula that is much faster than this exact calculation

  private Q mHarmonicSum = Q.ZERO;
  private Q mN = Q.NEG_ONE;
  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    while (mHarmonicSum.compareTo(mN) <= 0) {
      mK = mK.add(1);
      mHarmonicSum = mHarmonicSum.add(new Q(Z.ONE, mK));
    }
    return mK;
  }
}

