package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001693 Number of degree-n irreducible polynomials over GF(7); dimensions of free Lie algebras.
 * @author Sean A. Irvine
 */
public class A001693 extends Sequence0 {

  private final ArrayList<Z> mPowers = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mPowers.add(Z.ONE);
      return Z.ONE;
    }
    mPowers.add(mPowers.get(mN - 1).multiply(7));
    Z s = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final int dd = d.intValue();
      s = s.add(mPowers.get(mN / dd).multiply(Mobius.mobius(dd)));
    }
    return s.divide(mN);
  }
}
