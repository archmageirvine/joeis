package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034680 Sum of sixth powers of unitary divisors.
 * @author Sean A. Irvine
 */
public class A034680 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.pow(fs.getExponent(p) * 6).add(1));
    }
    return prod;
  }
}
