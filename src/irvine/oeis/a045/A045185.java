package irvine.oeis.a045;
// Generated by gen_seq4.pl basdig4 5 0 2 3 1 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A045185 Numbers whose base-5 representation contains exactly three 0's and one 2.
 * @author Georg Fischer
 */
public class A045185 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A045185() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 5, 0) == 3 
        && getDigitCount(mK, 5, 2) == 1;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
