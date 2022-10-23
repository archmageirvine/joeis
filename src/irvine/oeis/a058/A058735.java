package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.group.PolynomialRing;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000669;

/**
 * A058735 Triangle of coefficients in expansion of enumerators for series-reduced rooted trees by lines at the root.
 * @author Sean A. Irvine
 */
public class A058735 extends Sequence0 {

  // Roughly: T(n,k) = [x^n-k] Z(Sn; b1, ..., bn) where bk = Sum_{d|n} d * A000669(d) * x^(n/d)

  private static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);
  private final MemorySequence mS = MemorySequence.cachedSequence(new A000669());
  private int mN = 1;
  private int mM = 0;
  private Polynomial<Q> mA = null;

  private Polynomial<Q> sigma(final int n) {
    Polynomial<Q> s = RING.zero();
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      s = RING.add(s, RING.monomial(new Q(dd.multiply(mS.a(d - 1))), n / d));
    }
    return s;
  }

  @Override
  public Z next() {
    if (--mM < 2) {
      final CycleIndex zn = SymmetricGroup.create(++mN).cycleIndex();
      final List<Polynomial<Q>> sigma = new ArrayList<>();
      for (int k = 1; k <= mN; ++k) {
        sigma.add(sigma(k));
      }
      mA = zn.apply(sigma, Z.valueOf(mN));
      mM = mA.degree();
    }
    return mA.coeff(mM).toZ();
  }
}
