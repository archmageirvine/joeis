package irvine.oeis.a052;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052396 (+2)-sigma perfect numbers: numbers k such that (+2)sigma(k) = 2*k, where (+2)sigma(k) = A107758(k).
 * @author Sean A. Irvine
 */
public class A052396 extends Sequence1 {

  private Z mN = Z.ONE;

  private Z sigmaPlus2(final Z n) {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      Z sum = Z.TWO;
      Z q = p;
      for (int k = 1; k <= e; ++k, q = q.multiply(p)) {
        sum = sum.add(q);
      }
      prod = prod.multiply(sum);
    }
    return prod;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.multiply2().equals(sigmaPlus2(mN))) {
        return mN;
      }
    }
  }
}
