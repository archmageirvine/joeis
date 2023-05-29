package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063964 Numbers k such that k and k+1 have the same sum of squarefree divisors, or sqf(k) = sqf(k+1), where sqf(k) = A048250(k).
 * @author Sean A. Irvine
 */
public class A063964 extends Sequence1 {

  private long mN = 2;

  private Z sqf(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.add(1));
    }
    return prod;
  }

  @Override
  public Z next() {
    while (true) {
      if (sqf(++mN).equals(sqf(mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}

