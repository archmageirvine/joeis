package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046530 Number of distinct cubic residues mod n.
 * @author Sean A. Irvine
 */
public class A046530 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final Z p1 = p.subtract(1);
      Z sum = Z.ZERO;
      for (int j = 0; j <= (e - 1) / 3; ++j) {
        final long k = (Z.THREE.equals(p) && 3 * j < e - 1) || p.mod(3) == 1 ? 3 : 1;
        sum = sum.add(p1.multiply(p.pow(e - 3 * j - 1)).divide(k));
      }
      prod = prod.multiply(sum.add(1));
    }
    return prod;
  }
}
