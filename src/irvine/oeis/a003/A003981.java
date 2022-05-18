package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A003981 Inverse M\u00f6bius transform of A003965.
 * @author Sean A. Irvine
 */
public class A003981 extends A003965 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final Z q = fiboPi(p);
      prod = prod.multiply(q.pow(fs.getExponent(p) + 1).subtract(1).divide(q.subtract(1)));
    }
    return prod;
  }
}
