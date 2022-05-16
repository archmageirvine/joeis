package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015052 Smallest positive integer for which n divides a(n)^5.
 * @author Sean A. Irvine
 */
public class A015052 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.pow((fs.getExponent(p) + 4) / 5));
    }
    return prod;
  }
}
