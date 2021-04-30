package irvine.oeis.a048;
// manually

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A048314 Numbers whose base-3 expansions, read from left to right, have run lengths that strictly dencrease..
 * @author Georg Fischer
 */
public class A048314 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A048314() {
    this(0, 3);
  }

  /** 
   * Generic constructor with parameter
   * @param offset first index
   * @param base number base
   */
  public A048314(final int offset, final int base) {
    super(offset);
    mBase = base;
  }

  @Override
  public boolean isOk() {
    return hasDecreasingRunLengths(Z.valueOf(++mN), mBase);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
