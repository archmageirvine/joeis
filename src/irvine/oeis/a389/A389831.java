package irvine.oeis.a389;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389831 Multiplicative sequence a(n) with a(p^e) = 2 + e^2 for prime p and e &gt; 0.
 * @author Sean A. Irvine
 */
public class A389831 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final long e = fs.getExponent(p);
      prod = prod.multiply(2 + e * e);
    }
    return prod;
  }
}

