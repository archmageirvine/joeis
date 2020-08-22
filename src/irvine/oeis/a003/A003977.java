package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A003977 Inverse M\u00f6bius transform of A003963.
 * @author Sean A. Irvine
 */
public class A003977 extends A003963 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final Z q = pi(p);
      final int e = fs.getExponent(p) + 1;
      if (Z.TWO.equals(p)) {
        prod = prod.multiply(e);
      } else {
        prod = prod.multiply(q.pow(e).subtract(1).divide(q.subtract(1)));
      }
    }
    return prod;
  }
}
