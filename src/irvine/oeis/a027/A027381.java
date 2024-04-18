package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027381 Number of irreducible polynomials of degree n over GF(9); dimensions of free Lie algebras.
 * @author Sean A. Irvine
 */
public class A027381 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      final int mobius = Functions.MOBIUS.i((long) d);
      if (mobius != 0) {
        sum = sum.signedAdd(mobius > 0, Z.NINE.pow(mN / d));
      }
    }
    return sum.divide(mN);
  }
}
