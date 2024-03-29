package irvine.oeis.a043;
// Generated by gen_seq4.pl basrunmod 4 1 4 at 2019-07-04 11:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.base.RunsBaseSequence;

/**
 * A043829 Numbers n such that number of runs in the base 4 representation of n is congruent to 1 mod 4.
 * @author Georg Fischer
 */
public class A043829 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A043829() {
    super(1);
    // mK = ensureWidth(4, 1);
  }

  @Override
  protected boolean isOk() {
    return getRunCount(mK, 4) % 4 == 1;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}
