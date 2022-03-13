package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055128.
 * @author Sean A. Irvine
 */
public class A055128 implements Sequence {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Cheetah.factor(mN);
      Z prod = Z.ONE;
      for (final Z p : fs.toZArray()) {
        final int e = fs.getExponent(p);
        prod = prod.multiply(p.pow(e).add(p.pow(e - 1)).subtract(2));
      }
      if (prod.equals(mN)) {
        return mN;
      }
    }
  }
}
