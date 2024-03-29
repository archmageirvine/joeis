package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig3 4  0 2 3 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A039561 Numbers whose base-4 representation has the number of 0's, 2's and 3's.
 * @author Georg Fischer
 */
public class A039561 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039561() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 4, 0);
    final int count2 =  getDigitCount(mK, 4, 2);
    return  
        count1 == getDigitCount(mK, 4, 3)
        && count1 == count2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
