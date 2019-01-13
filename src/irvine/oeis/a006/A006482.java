package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006482.
 * @author Sean A. Irvine
 */
public class A006482 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 4) {
      if (mN == 3) {
        return Z.TWO;
      } else if (mN == 2) {
        return Z.ZERO;
      } else {
        return Z.ONE;
      }
    }
    return Binomial.binomial(mN, (mN & 3) <= 1 ? mN / 2 : mN / 2 - 1).subtract(1);
  }
}

