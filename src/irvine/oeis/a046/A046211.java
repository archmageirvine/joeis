package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.IntegerUtils;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046211 Number of ternary Lyndon words whose digits sum to 1 (or 2) mod 3; number of trace 1 (or 2) monic irreducible polynomials over GF(3).
 * @author Sean A. Irvine
 */
public class A046211 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      if (IntegerUtils.gcd(d, 3) == 1) {
        sum = sum.add(Z.THREE.pow(mN / d).multiply(Mobius.mobius(d)));
      }
    }
    return sum.divide(3L * mN);
  }
}
