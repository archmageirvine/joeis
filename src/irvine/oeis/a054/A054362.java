package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054362 Number of unlabeled 4-gonal cacti having n polygons.
 * @author Sean A. Irvine
 */
public class A054362 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z a = Integers.SINGLETON.sumdiv(mN, d -> Binomial.binomial(4L * d, d).multiply(Functions.PHI.l((long) (mN / d))));
    final Z b = Integers.SINGLETON.sumdiv(Functions.GCD.i(mN - 1, 4), d -> Binomial.binomial(4L * mN / d, (mN - 1) / d).multiply(Functions.PHI.l(d)));
    return a.add(b).divide(4L * mN).subtract(Binomial.binomial(4L * mN, mN).divide(3L * mN + 1));
  }
}
