package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 2 2 5 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A043730 Numbers whose number of runs in the base-2 representation is congruent to 2 mod 5.
 * @author Georg Fischer
 */
public class A043730 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043730() {
    super(1);
    // mK = ensureWidth(5, 2);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 2) % 5 == 2;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
