package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054862 (+2)-unitary sigma 3-multiple perfect number: numbers k such that (+2)usigma(k) = 3*k, where (+2)usigma(k) = A107759(k).
 * @author Sean A. Irvine
 */
public class A054862 extends Sequence1 {

  private long mN = 104;

  private Z usigma2Plus(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.pow(fs.getExponent(p)).add(2));
    }
    return prod;
  }

  @Override
  public Z next() {
    while (true) {
      if (usigma2Plus(++mN).equals(Z.valueOf(3L * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
