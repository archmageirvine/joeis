package irvine.oeis.a011;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011786 Number of 4 X 4 matrices whose determinant is 1 mod n.
 * @author Sean A. Irvine
 */
public class A011786 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
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
