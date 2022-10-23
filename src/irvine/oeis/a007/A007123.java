package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007123 Number of connected unit interval graphs with n nodes; also number of bracelets (turnover necklaces) with n black beads and n-1 white beads.
 * @author Sean A. Irvine
 */
public class A007123 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN - 1, (mN - 1) / 2).multiply2().add(Binomial.binomial(2 * mN, mN).divide(2 * mN - 1)).shiftRight(2);
  }
}
