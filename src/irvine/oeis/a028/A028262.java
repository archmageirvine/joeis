package irvine.oeis.a028;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A028262 Elements in 3-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A028262 extends AbstractSequence {

  /** Construct the sequence. */
  public A028262() {
    super(0);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mN <= 1 ? Z.ONE : Binomial.binomial(mN, mM).add(Binomial.binomial(mN - 2, mM - 1));
  }
}
