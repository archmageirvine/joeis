package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 2 3 5 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A043731 Numbers whose number of runs in the base-2 representation is congruent to 3 mod 5.
 * @author Georg Fischer
 */
public class A043731 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043731() {
    super(1);
    // mK = ensureWidth(5, 3);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 2) % 5 == 3;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
