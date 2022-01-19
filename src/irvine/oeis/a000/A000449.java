package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A000449 Rencontres numbers: number of permutations of [n] with exactly 3 fixed points.
 * @author Sean A. Irvine
 */
public class A000449 extends A000166 {

  protected int mFixP;

  /** Construct the sequence. */
  public A000449() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param fixP
   */
  public A000449(final int fixP) {
    mFixP = fixP;
  }

  @Override
  public Z next() {
    return super.next().multiply(Binomial.binomial(mN + mFixP, mFixP));
  }

}
