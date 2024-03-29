package irvine.oeis.a043;
// Generated by gen_seq4.pl basdig1 1 9 1 2 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A043458 Numbers having exactly two 1's in base 9.
 * @author Georg Fischer
 */
public class A043458 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043458() {
    super(1, 0); //
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 9, 1) == 2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
