package irvine.oeis.a004;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004124 Discriminant of n-th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A004124 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final Z t;
      if (e == 1) {
        t = p.pow(p.subtract(2).intValueExact());
      } else {
        t = p.pow(p.subtract(1).multiply(e).subtract(1).multiply(p.pow(e - 1)).intValueExact());
      }
      prod = prod.multiply(t.pow(LongUtils.phi(mN / p.pow(e).longValueExact())));
    }
    final long phi = LongUtils.phi(mN);
    if (Z.valueOf(phi).multiply(phi - 1).divide2().isOdd()) {
      prod = prod.negate();
    }
    return prod;
  }
}
