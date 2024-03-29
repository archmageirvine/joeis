package irvine.oeis.a043;
// Generated by gen_seq4.pl basruneq 2 14 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A043581 Numbers whose base-2 representation has exactly 14 runs.
 * @author Georg Fischer
 */
public class A043581 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043581() {
    super(1);
    mK = ensureWidth(14, 2);
  }

  @Override
  protected boolean isOk() {
    return hasRunCount(mK, 2, 14);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
