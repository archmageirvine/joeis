package irvine.oeis.a005;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005435 Number of column-convex polyominoes with perimeter 2n+2.
 * @author Sean A. Irvine
 */
public class A005435 extends Sequence1 {

  /*
       A
  G:=((x^2 - 1)*( - 21 + 47*x^2 - 35*x^4 + 5*x^6)
        B                             C
   - 3*(x^2 - 1)^2*(1 + x^2)*sqrt(1 - 6*x^2 + x^4)
                    D                          F                     E                     C
   -          9*(x^2 - 1)^2*sqrt(2*((x^2 - 1)^2*(1 + x^2) - (x^2 - 1)*(1 + x^2)*sqrt(1 - 6*x^2 + x^4)))
            G                                  F                     E                     C
    - x*(x^2 - 1)*(1 + x^2)*sqrt(2*((x^2 - 1)^2*(1 + x^2) + (x^2 - 1)*(1 + x^2)*sqrt(1 - 6*x^2 + x^4))))
           H
    /(72 - 152*x^2 + 92*x^4 - 8*x^6):
   */

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> A = RING.create(Arrays.asList(new Q(21), Q.ZERO, new Q(-68), Q.ZERO, new Q(82), Q.ZERO, new Q(-40), Q.ZERO, Q.FIVE));
  private static final Polynomial<Q> B = RING.create(Arrays.asList(Q.THREE, Q.ZERO, new Q(-3), Q.ZERO, new Q(-3), Q.ZERO, Q.THREE));
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.ZERO, Q.ZERO, new Q(-6), Q.ZERO, Q.ONE));
  private static final Polynomial<Q> D = RING.create(Arrays.asList(Q.NINE, Q.ZERO, new Q(-18), Q.ZERO, Q.NINE));
  private static final Polynomial<Q> E = RING.create(Arrays.asList(Q.NEG_ONE, Q.ZERO, Q.ZERO, Q.ZERO, Q.ONE));
  private static final Polynomial<Q> F = RING.create(Arrays.asList(Q.ONE, Q.ZERO, Q.NEG_ONE, Q.ZERO, Q.NEG_ONE, Q.ZERO, Q.ONE));
  private static final Polynomial<Q> G = RING.create(Arrays.asList(Q.ZERO, Q.NEG_ONE, Q.ZERO, Q.ZERO, Q.ZERO, Q.ONE));
  private static final Polynomial<Q> H = RING.create(Arrays.asList(new Q(72), Q.ZERO, new Q(-152), Q.ZERO, new Q(92), Q.ZERO, new Q(-8)));
  private int mN = 2;

  @Override
  public Z next() {
    mN += 2;
    final Polynomial<Q> sqrt = RING.sqrt1p(C, mN);
    final Polynomial<Q> line2 = RING.multiply(B, sqrt, mN);
    final Polynomial<Q> ec = RING.multiply(E, sqrt, mN);
    final Polynomial<Q> line3 = RING.multiply(D, A005222.sqrt(RING.multiply(RING.subtract(F, ec), Q.TWO), mN), mN);
    final Polynomial<Q> line4 = RING.multiply(G, A005222.sqrt(RING.multiply(RING.add(F, ec), Q.TWO).shift(-2), mN).shift(1), mN);
    final Polynomial<Q> num = RING.subtract(RING.subtract(RING.subtract(A, line2), line3), line4);
    //System.out.println(RING.series(num, H, mN));
    return RING.coeff(num, H, mN).toZ();
  }
}
