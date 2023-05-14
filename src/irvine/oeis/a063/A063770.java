package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063770 Numbers k such that Sum_{j=1..k} sigma(j) divides Product_{j=1..k} phi(j).
 * @author Sean A. Irvine
 */
public class A063770 extends Sequence1 {

  private long mN = 0;
  private Z mSum = Z.ZERO;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      mSum = mSum.add(fs.sigma());
      mProd = mProd.multiply(fs.phi());
      if (mProd.mod(mSum).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
