package irvine.oeis.a035;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035292 Number of similar sublattices of Z^4 of index n^2.
 * @author Sean A. Irvine
 */
public class A035292 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (Z.TWO.equals(p)) {
        prod = prod.multiply(3);
      } else {
        prod = prod.multiply(A035284.g(p, e));
      }
    }
    return prod;
  }
}
