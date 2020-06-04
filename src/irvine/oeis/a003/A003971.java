package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003971 Inverse M\u00f6bius transform of <code>A003960</code>.
 * @author Sean A. Irvine
 */
public class A003971 implements Sequence {

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
        prod = prod.multiply(p.add(1).divide2().pow(e).subtract(1).divide(p.subtract(1).divide2()));
      }
    }
    return prod;
  }
}
