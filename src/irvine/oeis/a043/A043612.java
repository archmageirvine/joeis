package irvine.oeis.a043;
// Generated by gen_seq4.pl basruneq 6 4 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A043612 Numbers whose base-6 representation has exactly 4 runs.
 * @author Georg Fischer
 */
public class A043612 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043612() {
    super(1);
    mK = ensureWidth(4, 6);
  }

  @Override
  protected boolean isOk() {
    return hasRunCount(mK, 6, 4);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
