package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 7  0 3 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A039032 Numbers whose base-7 representation has the same number of 0's and 3's.
 * @author Georg Fischer
 */
public class A039032 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039032() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 7, 0);
    return  count1 == getDigitCount(mK, 7, 3);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
