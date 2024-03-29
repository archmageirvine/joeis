package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 2 4 9 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A043758 Numbers n such that number of runs in the base 2 representation of n is congruent to 4 mod 9.
 * @author Georg Fischer
 */
public class A043758 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043758() {
    super(1);
    // mK = ensureWidth(9, 4);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 2) % 9 == 4;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
