package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A002348 Degree of rational Poncelet porism of n-gon.
 * @author Sean A. Irvine
 */
public class A002348 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (Z.TWO.equals(p)) {
        prod = prod.multiply(Z.ONE.shiftLeft(2L * e));
      } else {
        prod = prod.multiply(p.pow(2L * (e - 1)).multiply(p.square().subtract(1)));
      }
    }
    return prod.divide(8);
  }
}
