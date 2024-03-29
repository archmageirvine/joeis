package irvine.oeis.a214;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A214275 Number of compositions of n where the difference between largest and smallest parts equals 6 and adjacent parts are unequal.
 * @author Georg Fischer
 */
public class A214275 extends AbstractSequence {

  private final A214269 mSeq = new A214269();

  /** Construct the sequence. */
  public A214275() {
    super(7);
  }

  private int mN = 5;

  @Override
  public Z next() {
    ++mN;
    return mSeq.compute(mN, 6);
  }
}

