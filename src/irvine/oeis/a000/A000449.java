package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000449 Rencontres numbers: number of permutations of [n] with exactly 3 fixed points.
 * @author Sean A. Irvine
 */
public class A000449 extends AbstractSequence {

  protected int mFixP;
  private final A000166 mSeq = new A000166();

  /** Construct the sequence. */
  public A000449() {
    this(3);
  }

  /**
   * Generic constructor with parameter.
   * @param fixP number of fixed points
   */
  public A000449(final int fixP) {
    super(fixP);
    mFixP = fixP;
  }

  @Override
  public Z next() {
    return mSeq.next().multiply(Binomial.binomial(mSeq.mN + mFixP, mFixP));
  }

}
