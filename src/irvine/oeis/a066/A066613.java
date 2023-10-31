package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066613 Product of the nonzero digits = number of divisors.
 * @author Sean A. Irvine
 */
public class A066613 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.digitNZProduct(++mN, 10) == Jaguar.factor(mN).sigma0AsLong()) {
        return Z.valueOf(mN);
      }
    }
  }
}
