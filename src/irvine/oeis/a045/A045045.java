package irvine.oeis.a045;
// Generated by gen_seq4.pl basdig4 4 0 2 1 3 at 2019-07-04 09:18
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A045045 Numbers whose base-4 representation contains exactly one 0 and three 2's.
 * @author Georg Fischer
 */
public class A045045 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A045045() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return getDigitCount(mK, 4, 0) == 1 
        && getDigitCount(mK, 4, 2) == 3;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }

}
