package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037449 Discriminant of quadratic field Q(sqrt(n)).
 * @author Sean A. Irvine
 */
public class A037449 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      if ((fs.getExponent(p) & 1) == 1) {
        prod = prod.multiply(p);
      }
    }
    return prod.multiply(prod.mod(4) > 1 ? 4 : 1);
  }
}
