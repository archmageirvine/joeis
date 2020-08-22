package irvine.oeis.a032;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032106 Number of reversible strings with n black beads and n-1 white beads. String is not palindromic.
 * @author Sean A. Irvine
 */
public class A032106 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if ((mN & 1) == 0) {
      return Binomial.binomial(2 * mN, mN).subtract(Binomial.binomial(mN, mN / 2)).divide(4);
    } else {
      return Binomial.binomial(2 * mN, mN).subtract(Binomial.binomial(mN - 1, (mN - 1) / 2).multiply2()).divide(4);
    }
  }
}
