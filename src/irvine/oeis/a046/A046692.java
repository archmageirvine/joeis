package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046692 Dirichlet inverse of sigma function (A000203).
 * @author Sean A. Irvine
 */
public class A046692 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (e == 1) {
        prod = prod.multiply(p.negate().subtract(1));
      } else if (e == 2) {
        prod = prod.multiply(p);
      } else {
        // a(p^k) == 0, hence result will be 0
        return Z.ZERO;
      }
    }
    return prod;
  }
}

