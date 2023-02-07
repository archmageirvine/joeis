package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054724 Triangle of numbers of inequivalent Boolean functions of n variables with exactly k nonzero values (atoms) under action of complementing group.
 * @author Sean A. Irvine
 */
public class A054724 extends Sequence0 {

  private int mN = -1;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM > 1L << mN) {
      ++mN;
      mM = 0;
    }
    if ((mM & 1) == 0) {
      return Binomial.binomial(1L << mN, mM).add(Binomial.binomial(1L << (mN - 1), mM / 2).multiply((1L << mN) - 1)).shiftRight(mN);
    } else {
      return Binomial.binomial(1L << mN, mM).shiftRight(mN);
    }
  }
}
