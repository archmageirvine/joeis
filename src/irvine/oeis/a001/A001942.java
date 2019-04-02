package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A001942 Expansion of reciprocal of theta series of Leech lattice.
 * @author Sean A. Irvine
 */
public class A001942 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Z Z240 = Z.valueOf(240);
  private static final Z Z720 = Z.valueOf(720);
  private int mN = -2;

  static Polynomial<Z> f(final int n) {
    final ArrayList<Z> coeff = new ArrayList<>();
    coeff.add(Z.ZERO);
    for (int k = 1; k <= n; ++k) {
      coeff.add(Z.ZERO);
      coeff.add(Cheetah.factor(k).sigma(3));
    }
    return RING.add(RING.multiply(RING.create(coeff), Z240), RING.one());
  }

  private Polynomial<Z> t(final int n) {
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= n; ++k) {
      p = RING.multiply(p, RING.oneMinusXToTheN(2 * k), n);
    }
    p = RING.pow(p, 24, n);
    return p.shift(2); // q^2
  }

  @Override
  public Z next() {
    mN += 2;
    // Without this reciprocal this is A008408
    final Polynomial<Z> den = RING.subtract(RING.pow(f(mN), 3, mN), RING.multiply(t(mN), Z720));
    return RING.coeff(RING.one(), den, mN);
  }
}
