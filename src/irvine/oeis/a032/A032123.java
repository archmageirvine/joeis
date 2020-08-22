package irvine.oeis.a032;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a002.A002458;

/**
 * A032123 Number of 2n-bead black-white reversible strings with n black beads.
 * @author Sean A. Irvine
 */
public class A032123 extends A002458 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if ((mN & 1) == 0) {
      return Binomial.binomial(2 * mN - 1, mN - 1).add(Binomial.binomial(mN - 1, mN / 2 - 1));
    } else {
      return super.next();
    }
  }
}
