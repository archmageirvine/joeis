package irvine.oeis.a011;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011786.
 * @author Sean A. Irvine
 */
public class A011786 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final Z p2 = p.square();
      final Z p3 = p2.multiply(p);
      prod = prod.multiply(p.pow(15 * e - 9).multiply(p3.multiply(p).subtract(1)).multiply(p3.subtract(1)).multiply(p2.subtract(1)));
    }
    return prod;
  }
}
