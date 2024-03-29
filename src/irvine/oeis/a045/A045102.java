package irvine.oeis.a045;
// Generated by gen_seq4.pl basdig4 4 1 2 3 2 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A045102 Numbers whose base-4 representation contains exactly three 1's and two 2's.
 * @author Georg Fischer
 */
public class A045102 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A045102() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 4, 1) == 3 
        && getDigitCount(mK, 4, 2) == 2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
