package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046073 Number of squares in multiplicative group modulo n.
 * @author Sean A. Irvine
 */
public class A046073 implements Sequence {

  // After R. J. Mathar

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (p.isEven()) {
        prod = prod.multiply(p.pow(Math.max(e - 3, 0)));
      } else {
        prod = prod.multiply(p.subtract(1)).multiply(p.pow(e - 1)).divide2();
      }
    }
    return prod;
  }
}
