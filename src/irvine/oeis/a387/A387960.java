package irvine.oeis.a387;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A388063.
 * @author Sean A. Irvine
 */
public class A387960 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final long e = fs.getExponent(p) % 3;
      prod = prod.multiply(1 + e * (2 - e));
    }
    return prod;
  }
}

