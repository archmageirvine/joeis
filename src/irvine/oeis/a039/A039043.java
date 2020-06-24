package irvine.oeis.a039;
// Generated by gen_seq4.pl basdig2 7  2 6 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A039043 Numbers whose representation in base 7 has the same number of <code>2</code>'s and <code>6</code>'s.
 * @author Georg Fischer
 */
public class A039043 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A039043() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    final int count1 =  getDigitCount(mK, 7, 2);
    return  count1 == getDigitCount(mK, 7, 6);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
