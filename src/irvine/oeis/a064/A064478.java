package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064478 If n = Product p(k)^e(k) then a(n) = Product (p(k)+1)^e(k), a(0) = 1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A064478 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.valueOf(mN + 1);
    }
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(mN);
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.add(1).pow(fs.getExponent(p)));
    }
    return prod;
  }
}

