package irvine.math.q;

import java.io.Serializable;

import irvine.math.api.RationalSequence;

/**
 * Generate terms of the harmonic sequence.
 * @author Sean A. Irvine
 */
public class HarmonicSequence implements RationalSequence, Serializable {

  private final int mExponent;
  private long mN = 0;
  private Q mA = Q.ZERO;

  /**
   * Construct the generalized harmonic sequence with given exponent.
   * @param exponent the exponent
   */
  public HarmonicSequence(final int exponent) {
    mExponent = exponent;
  }

  /**
   * Construct the harmonic sequence.
   */
  public HarmonicSequence() {
    this(1);
  }

  @Override
  public final Q nextQ() {
    mA = mA.add(new Q(1, ++mN).pow(mExponent));
    return mA;
  }
}

