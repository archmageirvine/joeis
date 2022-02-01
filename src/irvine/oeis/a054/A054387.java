package irvine.oeis.a054;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054387 Numerators of coefficients of 1/2^(2n+1) in Newton's series for Pi.
 * @author Sean A. Irvine
 */
public class A054387 implements Sequence {

  private Z mF = Z.ONE;
  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(2L * mN - 2).multiply(2L * mN - 3).divide(mN - 1).divide(mN - 1);
    }
    return select(mN == 0 ? Q.ZERO : new Q(mF, Z.valueOf(2L * mN - 3).multiply(2L * mN + 1).shiftLeft(4 * mN - 2)).multiply(Z.ONE.shiftLeft(2 * mN + 1)));
  }
}
