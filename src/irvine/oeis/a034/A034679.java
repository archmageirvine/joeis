package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034679 Sum of fifth powers of unitary divisors.
 * @author Sean A. Irvine
 */
public class A034679 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.pow(fs.getExponent(p) * 5).add(1));
    }
    return prod;
  }
}
