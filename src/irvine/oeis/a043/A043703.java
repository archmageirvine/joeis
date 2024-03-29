package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunpar 14 0 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A043703 Numbers whose base-14 representation has an even number of runs.
 * @author Georg Fischer
 */
public class A043703 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043703() {
    super(1);
  }

  @Override
  protected boolean isOk() {
    return (getRunCount(mK, 14) & 1) == 0;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
