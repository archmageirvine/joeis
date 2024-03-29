package irvine.oeis.a043;
// Generated by gen_seq4.pl basruneq 15 4 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A043671 Numbers whose base-15 representation has exactly 4 runs.
 * @author Georg Fischer
 */
public class A043671 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043671() {
    super(1);
    mK = ensureWidth(4, 15);
  }

  @Override
  protected boolean isOk() {
    return hasRunCount(mK, 15, 4);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
