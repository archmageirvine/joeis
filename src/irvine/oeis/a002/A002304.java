package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.UnimplementedSequence;

/**
 * A002304 Numerators of coefficients in asymptotic expansion of (2/Pi)*Integral_{0..oo} (sin x / x)^n dx.
 * @author Sean A. Irvine
 */
public class A002304 extends Sequence0 implements UnimplementedSequence {

  // NOTE THIS IS CURRENTLY BROKEN
  // Various papers are available, but can't get this to work out
  // goddard at least matches that part of Vaclav's Mathematica code

//  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
//  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
//  private int mN = 0;
//
//  private Polynomial<Q> goddard(final int n, final int k) {
//    final BernoulliSequence bernoulli = new BernoulliSequence(0);
//    Polynomial<Q> s = RING.zero();
//    // Start at 2 to exclude -n/6*x^2
//    for (int m = 2; m <= k; ++m) {
//      final int m2 = 2 * m;
//      final Q coeff = bernoulli.get(m2).multiply(Z.ONE.shiftLeft(m2 - 1)).divide(mF.factorial(m2).multiply(m));
//      final Polynomial<Q> t = RING.monomial(coeff.abs().negate(), m2);
//      s = RING.add(s, t);
//    }
//    //System.out.println("s=" + s);
//    s = RING.multiply(s, new Q(n));
//    return RING.exp(s, 2 * k);
//  }
  // Exp[n*(x^2/6 + Sum[(-1)^m*BernoulliB[2*m]* 2^(2*m - 1)*(x^(2*m)/(m*(2*m)!)), {m, 1, k}])]

//  private Polynomial<Q> expCons(final int n) {
//    return RING.exp(RING.monomial(new Q(n), 2), 2 * n); // + 10 needed?
//  }
//
//  private Polynomial<Q> integrate2(final Polynomial<Q> p) {
//    Polynomial<Q> s = RING.one();
//    for (int k = 2; k <= p.degree(); k += 2) {
//      final Q a = p.coeff(k);
//      final int j = k - 1;
//      final int trueK = k / 2;
//      final Q y = new Q(mF.factorial(j), mF.factorial(trueK - 1).shiftLeft(j)).multiply(Z.SIX.pow(trueK));
//      s = RING.add(s, RING.monomial(y.multiply(a), trueK));
//    }
//    return s;
//  }

//  private Polynomial<Q> integrate3(final int n) {
//    Polynomial<Q> s = RING.zero();
//    for (int k = 0; k <= n; ++k) {
//      final Q t = new Q(Z.THREE.pow(k).multiply(mF.factorial(2 * k)),
//        mF.factorial(k).multiply(Z.valueOf(n).pow(k)).shiftLeft(k));
//      final Polynomial<Q> coeffPoly = goddard(n, k);
//      s = RING.add(s, RING.multiply(coeffPoly, t));
//    }
//    return s;
//  }
//
//  private Q integrate4(final int n) {
//    Q s = Q.ZERO;
//    for (int k = 0; k <= n; ++k) {
//      final Q t = new Q(Z.THREE.pow(k).multiply(mF.factorial(2 * k)),
//        mF.factorial(k).multiply(Z.valueOf(n).pow(k)).shiftLeft(k));
//      final Polynomial<Q> coeffPoly = goddard(n, k);
//      s = s.add(coeffPoly.coeff(2 * k).multiply(t));
//    }
//    return s;
//  }

  @Override
  public Z next() {
//    ++mN;
//    System.out.println("n=" + mN);
//    final Polynomial<Q> goddard = goddard(mN, mN);
//    System.out.println("goddard=" + goddard);
//    final Q coeff = goddard.coeff(2 * mN);
////    final Polynomial<Q> coeffPoly = RING.multiply(goddard(mN), expCons(mN), 2 * mN);
////    System.out.println("goddardexp=" + coeffPoly);
////    System.out.println("int2 = " + integrate2(goddard));
//    final Polynomial<Q> integral = integrate3(mN);
//    System.out.println("int3 = " + integral);
//    final Polynomial<Q> res = RING.divide(integral, new Q(mN));
//    System.out.println("res = " + res);
//    System.out.println("i4=" + integrate4(mN) + " " + integrate4(mN).divide(mN));
//    return res.coeff(mN).num();
    return null;
  }
}

/*
nmax = 20; Numerator[CoefficientList[Simplify[Sum[3^k*(2*k)!/(k!*2^k*n^k) * SeriesCoefficient[Exp[n*(x^2/6 + Sum[(-1)^m*BernoulliB[2*m]* 2^(2*m - 1)*(x^(2*m)/(m*(2*m)!)), {m, 1, k}])], {x, 0, 2*k}], {k, 0, nmax}]], 1/n]] (* Vaclav Kotesovec, Aug 10 2019 *)
 */
