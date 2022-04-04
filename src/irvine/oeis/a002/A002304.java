package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.UnimplementedException;

/**
 * A002304 Numerators of coefficients in asymptotic expansion of (2/Pi)*Integral_{0..inf} (sin x / x)^n dx.
 * @author Sean A. Irvine
 */
public class A002304 implements Sequence {

  // NOTE THIS IS CURRENTLY BROKEN
  // Various papers are available, but can't get this to work out

//  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
//  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
//  private int mN = 0;
//
//  private Polynomial<Q> goddard(final int k) {
//    final BernoulliSequence bernoulli = new BernoulliSequence(0);
//    Polynomial<Q> s = RING.zero();
//    // Start at 2 to exclude -n/6*x^2
//    for (int m = 2; m <= k; ++m) {
//      final int m2 = 2 * m;
//      final Q coeff = bernoulli.get(m2).multiply(Z.ONE.shiftLeft(m2 - 1)).divide(mF.factorial(m2).multiply(m));
//      final Polynomial<Q> t = RING.monomial(coeff, m2);
//      s = RING.signedAdd((k & 1) == 0, s, t);
//    }
//    System.out.println("s=" + s);
//    return RING.exp(s, 2 * k);
//    // I think this returns eqn 1.1 in Medhurst paper with the a_m filled in
//  }
//
//  private Polynomial<Q> goddardX(final int n) {
//    final BernoulliSequence bernoulli = new BernoulliSequence(0);
//    Polynomial<Q> s = RING.zero();
//    // Start at 2 to exclude -n/6*x^2
//    for (int k = 2; k <= n; ++k) {
//      final int j = 2 * k;
//      final Q coeff = bernoulli.get(j).multiply(Z.ONE.shiftLeft(j)).divide(mF.factorial(j).multiply(j));
//      final Polynomial<Q> t = RING.monomial(coeff, j);
//      s = RING.add(s, t);
//      //s = RING.signedAdd((k & 1) == 0, s, t);
//    }
//    System.out.println("s=" + s);
//    s = RING.multiply(s, new Q(-n));
//    //s = RING.subtract(s, RING.monomial(new Q(-n, 6), 2)); // take out exp(-n/6 * x^2)
//    // Thus exp(s) has constant terms and terms for degree 2k, k >= 2
//    return RING.exp(s, 2 * n + 10); // +10 etc needed?
//    // I think this returns eqn 1.1 in Medhurst paper with the a_m filled in
//  }
//
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
//
//  private Polynomial<Q> integrate3(final int n) {
//    Polynomial<Q> s = RING.zero();
//    for (int k = 0; k <= n; ++k) {
//      final Q t = new Q(Z.THREE.pow(k).multiply(mF.factorial(2 * k)),
//        mF.factorial(k).shiftLeft(k).multiply(Z.valueOf(n).pow(k)));
//      final Polynomial<Q> coeffPoly = RING.multiply(goddard(k), expCons(mN), 2 * mN);
//      s = RING.add(s, RING.multiply(coeffPoly, t));
//    }
//    return s;
//  }

  @Override
  public Z next() {
//    ++mN;
//    System.out.println("n=" + mN);
//    final Polynomial<Q> goddard = goddard(mN);
//    System.out.println("goddard=" + goddard);
//    final Polynomial<Q> coeffPoly = RING.multiply(goddard(mN), expCons(mN), 2 * mN);
//    System.out.println("goddardexp=" + coeffPoly);
//    System.out.println("int2 = " + integrate2(coeffPoly));
//    System.out.println("int3 = " + integrate3(mN));
//    return Z.ZERO;
    throw new UnimplementedException();
  }
}
