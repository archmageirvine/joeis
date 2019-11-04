package irvine.oeis;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * Sequence formed by the Beatty expansion of a computable real number.
 * @author Sean A. Irvine
 */
public abstract class BeattySequence implements Sequence {

  protected abstract CR getCR();
  private long mN;

  /**
   * A Beatty sequence starting at a specified value
   * @param initial start value
   */
  public BeattySequence(final long initial) {
    mN = initial - 1;
  }

  /** A Beatty sequence starting at 1. */
  public BeattySequence() {
    this(1);
  }
  
  @Override
  public Z next() {
    return getCR().multiply(++mN).floor();
  }
}
