package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013946 Least d for which the number with continued fraction [n,n,n,n...] is in Q(sqrt(d)).
 * @author Sean A. Irvine
 */
public class A013946 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z m = Z.valueOf(++mN).square().add(4);
    final FactorSequence fs = Jaguar.factor(m);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      if ((fs.getExponent(p) & 1) == 1) {
        prod = prod.multiply(p);
      }
    }
    return prod;
  }
}
