package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003967 Inverse M&#246;bius transform of A003958.
 * @author Sean A. Irvine
 */
public class A003967 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p) + 1;
      if (Z.TWO.equals(p)) {
        prod = prod.multiply(e);
      } else {
        prod = prod.multiply(p.subtract(1).pow(e).subtract(1).divide(p.subtract(2)));
      }
    }
    return prod;
  }
}
