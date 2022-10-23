package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003967 Inverse M\u00f6bius transform of A003958.
 * @author Sean A. Irvine
 */
public class A003967 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p) + 1;
      if (Z.TWO.equals(p)) {
        prod = prod.multiply(e);
      } else {
        prod = prod.multiply(p.subtract(1).pow(e).subtract(1).divide(p.subtract(2)));
      }
    }
    return prod;
  }
}
