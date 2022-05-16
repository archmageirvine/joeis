package irvine.oeis.a052;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a025.A025487;

/**
 * A052306 Product of exponents of prime factorization of n by prime signature: A005361(A025487).
 * @author Sean A. Irvine
 */
public class A052306 extends A025487 {

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(super.next());
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(fs.getExponent(p));
    }
    return prod;
  }
}
