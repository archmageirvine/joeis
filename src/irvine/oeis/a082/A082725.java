package irvine.oeis.a082;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082725 a(n) = n/A100762(n).
 * @author Sean A. Irvine
 */
public class A082725 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    final Z q = Functions.PREV_PRIME.z(fs.maxExponent() + 2);
    Z prod = Z.valueOf(mN);
    for (final Z p : fs.toZArray()) {
      if (p.compareTo(q) > 0) {
        break;
      }
      prod = prod.divide(p.pow(fs.getExponent(p)));
    }
    return prod;
  }
}
