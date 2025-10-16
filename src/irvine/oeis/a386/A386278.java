package irvine.oeis.a386;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386278 Multiplicative sequence a(n) with a(p^e) = 1 + (e mod 4) * (3 - (e mod 4)) for prime p and e &gt;= 0.
 * @author Sean A. Irvine
 */
public class A386278 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final long e = fs.getExponent(p) & 3;
      prod = prod.multiply(1 + e * (3 - e));
    }
    return prod;
  }
}

