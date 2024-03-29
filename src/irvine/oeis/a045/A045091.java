package irvine.oeis.a045;
// Generated by gen_seq4.pl basdig4 4 1 2 1 1 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A045091 Numbers whose base-4 representation contains exactly one 1 and one 2.
 * @author Georg Fischer
 */
public class A045091 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A045091() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 4, 1) == 1 
        && getDigitCount(mK, 4, 2) == 1;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
