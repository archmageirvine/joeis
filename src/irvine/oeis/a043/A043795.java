package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 3 4 7 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A043795 Numbers whose number of runs in base 3 is congruent to 4 (mod 7).
 * @author Georg Fischer
 */
public class A043795 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043795() {
    super(1);
    // mK = ensureWidth(7, 4);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 3) % 7 == 4;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
