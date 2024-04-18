package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046211 Number of ternary Lyndon words whose digits sum to 1 (or 2) mod 3; number of trace 1 (or 2) monic irreducible polynomials over GF(3).
 * @author Sean A. Irvine
 */
public class A046211 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      if (IntegerUtils.gcd(d, 3) == 1) {
        sum = sum.add(Z.THREE.pow(mN / d).multiply(Functions.MOBIUS.i((long) d)));
      }
    }
    return sum.divide(3L * mN);
  }
}
