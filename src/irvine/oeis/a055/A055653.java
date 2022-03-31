package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055653 Sum of phi(d) [A000010] over all unitary divisors d of n (that is, gcd(d,n/d) = 1).
 * @author Sean A. Irvine
 */
public class A055653 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final Z p1 = p.pow(e - 1);
      prod = prod.multiply(p1.multiply(p).subtract(p1).add(1));
    }
    return prod;
  }
}
