package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055128 Fixed points of the following function: if n = Product p(i)^r(i) then f(n) = Product (-2+p(i)^(r(i)-1)+p(i)^r(i)).
 * @author Sean A. Irvine
 */
public class A055128 extends Sequence1 {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
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
