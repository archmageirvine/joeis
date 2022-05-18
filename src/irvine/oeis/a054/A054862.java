package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054862 (+2)-unitary sigma 3-multiple perfect number: (+2)usigma(n)=3*n (if n=Product p(i)^r(i) then (+2)usigma(n)=Product (2+ p(i)^r(i))).
 * @author Sean A. Irvine
 */
public class A054862 implements Sequence {

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
