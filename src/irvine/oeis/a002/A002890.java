package irvine.oeis.a002;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.group.PolynomialRing;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002890 Low temperature series for spin-1/2 Ising partition function on 2D square lattice.
 * @author Sean A. Irvine
 */
public class A002890 implements Sequence {

  // Some documentation on the approach taken here is in a002890.tex

  private static final PolynomialRingField<Q> RINGW = new PolynomialRingField<>("W", Rationals.SINGLETON);
  private static final PolynomialRing<Polynomial<Q>> RINGY = new PolynomialRing<>("y", RINGW);
  private static final PolynomialRingField<Q> RING1 = new PolynomialRingField<>("y", Rationals.SINGLETON);

  private final ArrayList<Q> mEvenCosIntegrals = new ArrayList<>();
  private final ArrayList<Q> mBinomialExpansions = new ArrayList<>();
  private int mN = -2;

  private Polynomial<Polynomial<Q>> polyYW() {
    final Polynomial<Q> two = RINGW.monomial(Q.TWO, 0);
    final Polynomial<Polynomial<Q>> a = RINGY.create(Arrays.asList(RINGW.one(), RINGW.zero(), two, RINGW.zero(), RINGW.one()));
    final Polynomial<Polynomial<Q>> b = RINGY.create(Arrays.asList(RINGW.zero(), two, RINGW.zero(), RINGW.negate(two)));
    return RINGY.subtract(a, RINGY.multiply(b, RINGW.x()));
  }

  private Polynomial<Polynomial<Q>> lnYW(final int n) {
    final Polynomial<Polynomial<Q>> p = RINGY.subtract(polyYW(), RINGY.one());
    Polynomial<Polynomial<Q>> s = RINGY.zero();
    if (!RINGY.zero().equals(p)) {
      for (int k = 1; k <= n; ++k) {
        final Q inverse = new Q(1, k);
        final Polynomial<Q> ip = RINGW.monomial(inverse, 0);
        s = RINGY.signedAdd((k & 1) == 1, s, RINGY.multiply(RINGY.pow(p, k, n), ip));
      }
    }
    return s;
  }

  private Q integrateCosEven(final int halfPower) {
    while (halfPower >= mEvenCosIntegrals.size()) {
      final int n = mEvenCosIntegrals.size();
      mEvenCosIntegrals.add(new Q(Binomial.binomial(2 * n, n), Z.ONE.shiftLeft(2 * n)));
    }
    return mEvenCosIntegrals.get(halfPower);
  }

  private Q integrateCos(final int power) {
    return (power & 1) == 1 ? Q.ZERO : integrateCosEven(power / 2);
  }

  private Q computeBinomialTheoremExpansion(final int k) {
    Q t = Q.ZERO;
    if ((k & 1) == 0) { // odd values result in 0
      for (int j = 0; j <= k; ++j) {
        t = t.add(integrateCos(j).multiply(integrateCos(k - j)).multiply(Binomial.binomial(k, j)));
      }
    }
    return t;
  }

  // Remember previous values for efficiency
  private Q binomialTheoremExpansion(final int k) {
    while (k >= mBinomialExpansions.size()) {
      mBinomialExpansions.add(computeBinomialTheoremExpansion(mBinomialExpansions.size()));
    }
    return mBinomialExpansions.get(k);
  }

  private Q integrateEvalW(final Polynomial<Q> p) {
    Q res = Q.ZERO;
    for (int k = 0; k <= p.degree(); k += 2) { // all odd terms are 0
      final Q pu = p.coeff(k);
      if (!Q.ZERO.equals(pu)) {
        res = res.add(pu.multiply(binomialTheoremExpansion(k)));
      }
    }
    return res;
  }

  private Polynomial<Q> integrateEvalYW(final Polynomial<Polynomial<Q>> p) {
    final ArrayList<Q> coeff = new ArrayList<>();
    for (int k = 0; k <= p.degree(); k += 2) { // all odd terms are 0
      coeff.add(integrateEvalW(p.coeff(k)));
      coeff.add(Q.ZERO); // odd term
    }
    return RING1.create(coeff);
  }


  @Override
  public Z next() {
    mN += 2;
    final Polynomial<Polynomial<Q>> lnYW = lnYW(mN);
    //System.out.println("ln=" + lnYW);
    final Polynomial<Q> integratedY = integrateEvalYW(lnYW);
    //System.out.println("alpha=" + integratedY);
    final Polynomial<Q> gf = RING1.exp(RING1.divide(integratedY, Q.TWO), mN);
    //System.out.println("pi=" + pi);
    return gf.coeff(mN).toZ();
  }
}
