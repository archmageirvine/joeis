package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034677 Sum of cubes of unitary divisors of n.
 * @author Sean A. Irvine
 */
public class A034677 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.pow(fs.getExponent(p) * 3).add(1));
    }
    return prod;
  }
}
