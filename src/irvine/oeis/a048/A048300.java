package irvine.oeis.a048;
// manually

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A048300 Numbers whose base-3 expansions, read from left to right, have run lengths that strictly increase..
 * @author Georg Fischer
 */
public class A048300 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A048300() {
    this(0, 3);
  }

  /** 
   * Generic constructor with parameter
   * @param offset first index
   * @param base number base
   */
  public A048300(final int offset, final int base) {
    super(offset);
    mBase = base;
  }

  @Override
  public boolean isOk() {
    return hasIncreasingRunLengths(Z.valueOf(++mN), mBase);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
