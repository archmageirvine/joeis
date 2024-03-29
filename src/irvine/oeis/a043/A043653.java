package irvine.oeis.a043;
// Generated by gen_seq4.pl basruneq 12 4 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A043653 Numbers whose base-12 representation has exactly 4 runs.
 * @author Georg Fischer
 */
public class A043653 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043653() {
    super(1);
    mK = ensureWidth(4, 12);
  }

  @Override
  protected boolean isOk() {
    return hasRunCount(mK, 12, 4);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
