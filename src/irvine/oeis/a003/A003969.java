package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003969 Inverse M\u00f6bius transform of A003959.
 * @author Sean A. Irvine
 */
public class A003969 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.add(1).pow(fs.getExponent(p) + 1).subtract(1).divide(p));
    }
    return prod;
  }
}
