package irvine.oeis.a011;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011785 Number of 3 X 3 matrices whose determinant is 1 mod n.
 * @author Sean A. Irvine
 */
public class A011785 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final Z p2 = p.square();
      prod = prod.multiply(p.pow(8 * e - 5).multiply(p2.multiply(p).subtract(1)).multiply(p2.subtract(1)));
    }
    return prod;
  }
}
