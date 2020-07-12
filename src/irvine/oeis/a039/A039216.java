package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 12  0 7 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039216 Numbers n such that representation in base 12 has the same number of <code>0</code>'s and <code>7</code>'s.
 * @author Georg Fischer
 */
public class A039216 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039216() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 12, 0);
    return  count1 == getDigitCount(mK, 12, 7);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
