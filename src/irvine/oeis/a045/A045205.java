package irvine.oeis.a045;
// Generated by gen_seq4.pl basdig4 5 0 4 0 3 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A045205 Numbers whose base-5 representation contains no 0's and exactly three 4's.
 * @author Georg Fischer
 */
public class A045205 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A045205() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 5, 0) == 0 
        && getDigitCount(mK, 5, 4) == 3;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
