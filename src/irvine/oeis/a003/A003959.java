package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003959.
 * @author Sean A. Irvine
 */
public class A003959 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Cheetah.factor(mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.add(1).pow(fs.getExponent(p)));
    }
    return prod;
  }
}
