package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002304 Numerators of coefficients in asymptotic expansion of <code>(2/Pi)*Integral_{0..inf}</code> (sin <code>x / x)^n</code> dx.
 * @author Sean A. Irvine
 */
public class A002304 implements Sequence {

  // NOTE THIS IS CURRENTLY BROKEN
  // Various papers are available, but can't get this to work out

//  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
//  private final MemoryFactorial mF = new MemoryFactorial();
//  private int mN = 0;
//
//  private Polynomial<Q> goddard(final int n) {
//    final BernoulliSequence bernoulli = new BernoulliSequence(2);
//    Polynomial<Q> s = RING.zero();
//    // Start at 2 to exclude -n/6*x^2
//    for (int k = 2; k <= n; ++k) {
//      final int j = 2 * k;
//      final Q coeff = bernoulli.nextQ().multiply(Z.ONE.shiftLeft(j)).divide(mF.factorial(j).multiply(j));
//      final Polynomial<Q> t = RING.monomial(coeff, j);
//      s = RING.add(s, t);
//      bernoulli.nextQ();
//    }
//    s = RING.multiply(s, new Q(-n));
//    //s = RING.subtract(s, RING.monomial(new Q(-n, 6), 2)); // take out exp(-n/6 * x^2)
//    // Thus exp(s) has constant terms and terms for degree 2k, k >= 2
//    return RING.exp(s, 2 * n + 10); // +10 etc needed?
//    // I think this returns eqn 1.1 in Medhurst paper with the a_m filled in
//  }
//
//  /*
//  private Polynomial<Q> expCons(final int n) {
//    return RING.exp(RING.monomial(new Q(-n, 6), 2), 2 * n + 10); // + 10 needed?
//  }
//
//  private Polynomial<Q> direct(final int n, final int k) {
//    // direct expansion, not using Goddard formula
//    return RING.pow(RING.series(RING.sin(RING.x(), k), RING.x(), k), n, k);
//  }
//  */
//
////  private Q integrate(final Polynomial<Q> p, final int k) {
////    final Q a = p.coeff(2 * k);
////    final int j = 2 * k - 1;
////    final Q y = new Q(mF.factorial(j), mF.factorial(k - 1).shiftLeft(j)).multiply(Z.SIX.pow(k));
////    return y.multiply(a);
////  }
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

  @Override
  public Z next() {
//    ++mN;
//    System.out.println("n=" + mN);
//    final Polynomial<Q> goddard = goddard(mN);
//    System.out.println("goddard=" + goddard);
//    //final Polynomial<Q> coeffPoly = RING.series(goddard(mN), expCons(mN), 2 * mN + 10); // +2 needed?
//    //    System.out.println("goddard/exp=" + coeffPoly);
//    /*
//    for (int k = 1; k <= 2 * mN + 2; ++k) {
//      System.out.println("int" + k + " = " + integrate(goddard, k));
//    }
//    */
//    System.out.println("int2 = " + integrate2(goddard));
//    //final Polynomial<Q> direct = direct(mN, 2 * mN + 10);
//    //System.out.println("direct=" + direct);
//    //System.out.println("direct/exp=" + RING.series(direct, expCons(mN), 2 * mN + 10));
//    //System.out.println(integrate(direct, mN));
//    //return Z.ZERO;
    throw new UnsupportedOperationException();
  }
}
