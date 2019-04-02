package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000593 Sum of odd divisors of n.
 * @author Sean A. Irvine
 */
public class A000593 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      if (!Z.TWO.equals(p)) {
        final int e = fs.getExponent(p);
        prod = prod.multiply(p.pow(e + 1).subtract(1)).divide(p.subtract(1));
      }
    }
    return prod;
  }
}

