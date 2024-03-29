package irvine.oeis.a043;
// Generated by gen_seq4.pl basruneq 16 6 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A043679 Numbers whose base-16 representation has exactly 6 runs.
 * @author Georg Fischer
 */
public class A043679 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043679() {
    super(1);
    mK = ensureWidth(6, 16);
  }

  @Override
  protected boolean isOk() {
    return hasRunCount(mK, 16, 6);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
