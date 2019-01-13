package irvine.math.q;

import irvine.math.api.RationalSequence;

/**
 * Generate terms of the harmonic sequence.
 * @author Sean A. Irvine
 */
public class HarmonicSequence implements RationalSequence {

  private long mN = 0;
  private Q mA = Q.ZERO;

  @Override
  public final Q next() {
    mA = mA.add(new Q(1, ++mN));
    return mA;
  }
}

