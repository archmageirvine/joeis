package irvine.oeis.a043;
// Generated by gen_seq4.pl basdig1 1 6 1 3 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A043375 Numbers having three 1's in base 6.
 * @author Georg Fischer
 */
public class A043375 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043375() {
    super(1, 0); //
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 6, 1) == 3;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
