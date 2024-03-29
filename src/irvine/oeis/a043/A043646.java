package irvine.oeis.a043;
// Generated by gen_seq4.pl basruneq 11 3 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A043646 Numbers whose base-11 representation has exactly 3 runs.
 * @author Georg Fischer
 */
public class A043646 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043646() {
    super(1);
    mK = ensureWidth(3, 11);
  }

  @Override
  protected boolean isOk() {
    return hasRunCount(mK, 11, 3);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
