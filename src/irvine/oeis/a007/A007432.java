package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007432.
 * @author Sean A. Irvine
 */
public class A007432 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Cheetah.factor(++mN);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      Z t = Z.ZERO;
      for (int k = 0; k <= 3; ++k) {
        if (e >= k) {
          t = t.signedAdd((k & 1) == 0, Binomial.binomial(3, k).multiply(p.pow(e - k)));
        }
      }
      prod = prod.multiply(t);
    }
    return prod;
  }
}
