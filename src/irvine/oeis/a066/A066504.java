package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066504 Sum of n/p^k over all maximal prime-power divisors of n.
 * @author Sean A. Irvine
 */
public class A066504 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(mN / p.pow(fs.getExponent(p)).longValueExact());
    }
    return sum;
  }
}
