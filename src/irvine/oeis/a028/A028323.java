package irvine.oeis.a028;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028323 Elements to the right of the central elements of the 5-Pascal triangle A028313.
 * @author Sean A. Irvine
 */
public class A028323 extends Sequence0 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = mN / 2 + 1;
    }
    return mN <= 1 ? Z.ONE : Binomial.binomial(mN, mM).add(Binomial.binomial(mN - 2, mM - 1).multiply(3));
  }
}
