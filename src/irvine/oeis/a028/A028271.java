package irvine.oeis.a028;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A028271 Elements to right of central elements in 3-Pascal triangle A028262.
 * @author Sean A. Irvine
 */
public class A028271 extends AbstractSequence {

  /** Construct the sequence. */
  public A028271() {
    super(0);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = mN / 2 + 1;
    }
    return mN <= 1 ? Z.ONE : Binomial.binomial(mN, mM).add(Binomial.binomial(mN - 2, mM - 1));
  }
}
