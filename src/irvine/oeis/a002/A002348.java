package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.util.FactorSequence;
import irvine.factor.factor.Cheetah;

/**
 * A002348 Degree of rational Poncelet porism of <code>n-gon</code>.
 * @author Sean A. Irvine
 */
public class A002348 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (Z.TWO.equals(p)) {
        prod = prod.multiply(Z.ONE.shiftLeft(2 * e));
      } else {
        prod = prod.multiply(p.pow(2 * (e - 1)).multiply(p.square().subtract(1)));
      }
    }
    return prod.divide(8);
  }
}
