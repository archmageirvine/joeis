package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.q.Q;

import java.util.ArrayList;
import irvine.math.polynomial.Polynomial;

/**
 * A002190 Sum_{n&gt;=0} a(n)*x^n/n!^2 = -log(BesselJ(0,2*sqrt(x))).
 * @author Sean A. Irvine
 */
public class A002190 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  private Z mF = Z.ONE;
  private final ArrayList<Z> mF2 = new ArrayList<>();

  // squared factorial
  private Z f2(final int n) {
    while (n >= mF2.size()) {
      if (mF2.size() > 1) {
        mF = mF.multiply(mF2.size()).multiply(mF2.size());
      }
      mF2.add(mF);
    }
    return mF2.get(n);
  }

  @Override
  public Z next() {
    ++mN;
    final ArrayList<Q> coeff = new ArrayList<>();
    coeff.add(Q.ZERO);
    for (int k = 1; k <= mN; ++k) {
      coeff.add(new Q((k & 1) == 0 ? Z.ONE : Z.NEG_ONE, f2(k)));
    }
    final Polynomial<Q> series = RING.log1p(RING.create(coeff), mN);
    return series.coeff(mN).multiply(f2(mN)).toZ().negate();
  }
}
