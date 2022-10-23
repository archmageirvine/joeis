package irvine.oeis.a029;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A029760 A sum with next-to-central binomial coefficients of even order, Catalan related.
 * @author Sean A. Irvine
 */
public class A029760 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(4).add(Binomial.binomial(2 * mN + 2, mN));
    }
    return mA;
  }
}
