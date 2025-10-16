package irvine.oeis.a389;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A388063.
 * @author Sean A. Irvine
 */
public class A389698 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final long e = fs.getExponent(p);
      prod = prod.multiply(4 * e * e + 2);
    }
    return prod;
  }
}

