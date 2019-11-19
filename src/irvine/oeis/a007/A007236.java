package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007236.
 * @author Sean A. Irvine
 */
public class A007236 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private static Polynomial<Q> toQ(final long... c) {
    final List<Q> q = new ArrayList<>(c.length);
    for (final long l : c) {
      q.add(new Q(l));
    }
    return RING.create(q);
  }

  private static final Polynomial<Q> C1 = toQ(1, -1, 1);
  private static final Polynomial<Q> C2 = toQ(1, -2);
  private static final Polynomial<Q> C3 = toQ(2, -2);
  private static final Polynomial<Q> C5 = toQ(-5);
  private static final Polynomial<Q> Q1 = RING.multiply(C1, toQ(1, -5, 5));
  private static final Polynomial<Q> Q2 = RING.multiply(C2, toQ(1, -11, 44, -77, 66, -33, 11));
  private static final Polynomial<Q> Q3 = toQ(1, -16, 106, -378, 803, -1080, 962, -576, 219, -50, 10);
  private static final Polynomial<Q> R1 = toQ(7, -44, 99, -110, 55);
  private static final Polynomial<Q> R2 = RING.multiply(C2, toQ(7, -16, 21, -10, 5));

  private int mN = -1;

  @Override
  public Z next() {
    // s = -5 + (R1(x)+R2(x)*(1-x+x^2)^(-1)*sqrt(Q1(x))) / (2*Q3(x)+2*Q2(x)*sqrt(Q1(x)))^(1/2)
    // a(n) = [x^n] 2*(1-x)/s(x)
    final Polynomial<Q> sq1 = RING.sqrt(Q1, ++mN);
    final Polynomial<Q> s1 = RING.series(RING.multiply(R2, sq1), C1, mN);
    final Polynomial<Q> s2 = RING.add(R1, s1);
    final Polynomial<Q> s3 = RING.multiply(RING.add(RING.multiply(Q2, sq1), Q3), Q.TWO);
    final Polynomial<Q> s = RING.add(RING.series(s2, RING.multiply(RING.sqrt(RING.divide(s3, new Q(4)), mN), Q.TWO), mN), C5);
    return RING.coeff(C3, s, mN).toZ();
  }
}
