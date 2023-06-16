package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064084 A multiplicative version of 2^n - 1 (A000225).
 * @author Sean A. Irvine
 */
public class A064084 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(Z.ONE.shiftLeft(p.pow(fs.getExponent(p)).longValueExact()).subtract(1));
    }
    return prod;
  }
}
