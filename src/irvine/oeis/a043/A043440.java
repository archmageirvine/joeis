package irvine.oeis.a043;
// Generated by gen_seq4.pl basdig1 1 8 4 4 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A043440 Numbers having four 4's in base 8.
 * @author Georg Fischer
 */
public class A043440 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043440() {
    super(1, 0); //
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 8, 4) == 4;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
