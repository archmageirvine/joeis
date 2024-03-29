package irvine.oeis.a043;
// Generated by gen_seq4.pl basdig1 1 7 4 3 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A043411 Numbers whose base-7 representation contains exactly three 4's.
 * @author Georg Fischer
 */
public class A043411 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043411() {
    super(1, 0); //
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 7, 4) == 3;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
