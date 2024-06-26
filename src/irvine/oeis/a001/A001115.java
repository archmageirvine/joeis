package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001115 Maximal number of pairwise relatively prime polynomials of degree n over GF(2).
 * @author Sean A. Irvine
 */
public class A001115 extends Sequence0 {

  private final ArrayList<Z> mP = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mP.add(Z.ONE);
    } else {
      Z p = Z.ZERO;
      for (final Z dd : Jaguar.factor(mN).divisors()) {
        final int d = dd.intValue();
        p = p.add(Z.valueOf(Functions.MOBIUS.i(mN / d)).shiftLeft(d));
      }
      mP.add(p.divide(mN));
    }
    Z a = mP.get(mN);
    for (int k = 1; k <= mN / 2; ++k) {
      a = a.add(mP.get(k));
    }
    return a;
  }
}

