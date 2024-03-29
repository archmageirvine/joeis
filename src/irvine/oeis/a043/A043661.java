package irvine.oeis.a043;
// Generated by gen_seq4.pl basruneq 13 6 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A043661 Numbers whose base-13 representation has exactly 6 runs.
 * @author Georg Fischer
 */
public class A043661 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043661() {
    super(1);
    mK = ensureWidth(6, 13);
  }

  @Override
  protected boolean isOk() {
    return hasRunCount(mK, 13, 6);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
