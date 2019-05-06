package irvine.oeis;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * Sequence like a Beatty sequence but formed by rounding the result rather than the floor function.
 * @author Sean A. Irvine
 */
public abstract class RoundingBeattySequence implements Sequence {

  protected abstract CR getCR();
  private long mN;

  /**
   * A Beatty sequence starting at a specified value
   * @param initial start value
   */
  public RoundingBeattySequence(final long initial) {
    mN = initial - 1;
  }

  /** A Beatty sequence starting at 1. */
  public RoundingBeattySequence() {
    this(1);
  }
  
  @Override
  public Z next() {
    return getCR().multiply(CR.valueOf(++mN)).round(32);
  }
}
