package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.IntegerUtils;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046209 Number of ternary Lyndon words whose digits sum to 0 mod 3; also number of trace 0 irreducible polynomials over GF(3).
 * @author Sean A. Irvine
 */
public class A046209 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Z.THREE.pow(mN / d).multiply(IntegerUtils.gcd(d, 3)).multiply(Mobius.mobius(d)));
    }
    return sum.divide(3L * mN);
  }
}
