package irvine.oeis.a045;
// Generated by gen_seq4.pl basdig4 5 1 4 2 2 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A045257 Numbers whose base-5 representation contains exactly two 1's and two 4's.
 * @author Georg Fischer
 */
public class A045257 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A045257() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 5, 1) == 2 
        && getDigitCount(mK, 5, 4) == 2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
