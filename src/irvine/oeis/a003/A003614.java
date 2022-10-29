package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.UnimplementedSequence;

/**
 * A003614 Symmetries in unrooted (1,4) trees on 3n-1 vertices.
 * @author Sean A. Irvine
 */
public class A003614 extends Sequence1 implements UnimplementedSequence {

  // todo I suspect Eqn (1.2.16) in paper is incorrect
  // Note I've tried to do this twice now. This time I used the newer MultivariatePolynomial
  // base code.  Thus the step() here computes A003611 (verified).

  @Override
  public Z next() {
    return null;
  }

//  protected static final MultivariatePolynomialField<Q> RING = new MultivariatePolynomialField<>(Rationals.SINGLETON, 2);
//  private static final int[] CONST = {0, 0};
//  private static final int[] SUBS = {2, 2};
//  private static final int[] Y2X = {2, 1};
//  private static final MultivariatePolynomial<Q> C0 = RING.monomial(Q.HALF, CONST);
//  private static final MultivariatePolynomial<Q> C1 = RING.subtract(RING.monomial(Q.ONE, new int[] {0, 1}), RING.monomial(Q.HALF, CONST));
//  private static final MultivariatePolynomial<Q> X = RING.monomial(Q.ONE, new int[] {1, 0});
//  protected MultivariatePolynomial<Q> mT = X;
//  protected int mN = 0;
//
//  // Note formula for S_n in McKeon articles is wrong, should be
//  // S_n = Sum_{k=0..n} T(k, n) * 2^k
//
//  // T(x,y) = x + (x/2)T(x,y)^2 + xT(x,y) + x(y-1/2)T(x^2,y^2)
//  // T(x,y) = x(1 + T(x,y) + (1/2)T(x,y)^2 + (y-1/2)T(x^2,y^2))
//  protected void stepT(final int n) {
//    // I verified this correctly produces T
//    final int[] limits = {n, n};
//    // Apply the T(x,y) relation
//    final MultivariatePolynomial<Q> s = RING.multiply(mT.substitutePowers(SUBS, limits), C1);
//    final MultivariatePolynomial<Q> u = RING.add(RING.add(RING.one(), mT), RING.multiply(RING.pow(mT, 2, limits), C0));
//    mT = RING.multiply(RING.add(u, s), X);
//  }
//
//  @Override
//  public Z next() {
//    stepT(++mN); // Updates mT
//    // Compute S_n
//    //return mT.extract(0, mN).eval(Q.TWO).toZ();
//
//    System.out.println("T=" + mT);
//
//    // Eqn (1.2.16)
//    final int[] limits = {mN + 3, mN + 3}; // +2 allows for /x^2
//    final Q a = mT.subs(1, Q.TWO).extract(0, mN).eval(Q.ONE);
//    //System.out.println("T(x^2,4)=" + mT.substitutePowers(Y2X, limits).subs(1, Q.FOUR));
//    final Q b = mT.substitutePowers(Y2X, limits).subs(1, Q.FOUR).extract(0, mN + 1).eval(Q.ONE).multiply(new Q(3, 2));
//    final Q c = RING.pow(mT.subs(1, Q.TWO), 2, limits).extract(0, mN + 1).eval(Q.ONE).divide2();
//    final Q d = RING.pow(mT.subs(1, Q.TWO), 4, limits).extract(0, mN + 2).eval(Q.ONE).divide(24);
//    //System.out.println("T(x^2,4)T(x,2)^2=" + RING.multiply(mT.substitutePowers(Y2X, limits).subs(1, Q.FOUR), RING.pow(mT.subs(1, Q.TWO), 2, limits), limits));
//    final Q e = RING.multiply(mT.substitutePowers(Y2X, limits).subs(1, Q.FOUR), RING.pow(mT.subs(1, Q.TWO), 2, limits), limits).extract(0, mN + 2).eval(Q.ONE).multiply(new Q(3, 4));
//    final Q f = RING.pow(mT.substitutePowers(Y2X, limits).subs(1, Q.FOUR), 2, limits).extract(0, mN + 2).eval(Q.ONE).multiply(new Q(9, 8));
//    final Q g = mT.substitutePowers(new int[] {4, 1}, limits).subs(1, new Q(16)).extract(0, mN + 2).eval(Q.ONE).multiply(new Q(71, 4));
//    //System.out.println("T(x^3,8)T(x,2)=" + RING.multiply(mT.substitutePowers(new int[] {3, 1}, limits).subs(1, Q.EIGHT), mT.subs(1, Q.TWO), limits));
//    final Q h = RING.multiply(mT.substitutePowers(new int[] {3, 1}, limits).subs(1, Q.EIGHT), mT.subs(1, Q.TWO), limits).extract(0, mN + 2).eval(Q.ONE).multiply(new Q(13, 3));
//    System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d + " e=" + e + " f=" + f + " g=" + g + " h=" + h);
//    return a.add(b).subtract(c).add(d).add(e).add(f).add(g).add(h).toZ();
//  }

  /* Maple: (also does not work)
  T:=(x,y)->1*x+1*x^2+1*x^3+1*x^3*y+2*x^4+1*x^4*y+3*x^5+3*x^5*y+6*x^6+5*x^6*y+11*x^7+11*x^7*y+1*x^7*y^3+22*x^8+22*x^8*y+1*x^8*y^2+1*x^8*y^3+43*x^9+48*x^9*y+4*x^9*y^2+3*x^9*y^3;

expand(T(x,2)+(3/2/x)*T(x^2,4)-(1/2/x)*T(x,2)^2+(1/24/x^2)*T(x,2)^4+(3/4/x^2)*T(x^2,4)*T(x,2)^2+(9/8/x^2)*T(x^2,4)^2+(71/4/x^2)*T(x^4,16)+(13/3/x^2)*T(x^3,8)*T(x,2));
   */
}

