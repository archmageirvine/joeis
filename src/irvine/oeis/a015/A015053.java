package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015053 Smallest positive integer for which n divides a(n)^6.
 * @author Sean A. Irvine
 */
public class A015053 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.pow((fs.getExponent(p) + 5) / 6));
    }
    return prod;
  }
}
