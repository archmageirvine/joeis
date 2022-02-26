package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054845.
 * @author Sean A. Irvine
 */
public class A054862 implements Sequence {

  private long mN = 104;

  private Z usigma2Plus(final long n) {
    final FactorSequence fs = Cheetah.factor(n);
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
