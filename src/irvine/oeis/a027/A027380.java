package irvine.oeis.a027;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027380 Number of irreducible polynomials of degree n over GF(8); dimensions of free Lie algebras.
 * @author Sean A. Irvine
 */
public class A027380 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      final int mobius = Mobius.mobius(d);
      if (mobius != 0) {
        sum = sum.signedAdd(mobius > 0, Z.ONE.shiftLeft(3 * (mN / d)));
      }
    }
    return sum.divide(mN);
  }
}
