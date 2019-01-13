package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A003978.
 * @author Sean A. Irvine
 */
public class A003978 extends A003964 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Cheetah.factor(mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final Z q = partitionPi(p);
      prod = prod.multiply(q.pow(fs.getExponent(p) - 1).multiply(q.subtract(1)));
    }
    return prod;
  }
}
