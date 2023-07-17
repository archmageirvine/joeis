package irvine.oeis.a057;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A057968 Triangle T(n,k) of numbers of minimal 5-covers of an unlabeled n+5-set that cover k points of that set uniquely (k=5,..,n+5).
 * @author Sean A. Irvine
 */
public class A057968 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A057968(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A057968() {
    super(0);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO = RING.monomial(Q.TWO, 0);
  private static final Polynomial<Q> THREE = RING.monomial(Q.THREE, 0);
  private static final Polynomial<Q> FOUR = RING.monomial(Q.FOUR, 0);
  private static final Polynomial<Q> SIX = RING.monomial(Q.SIX, 0);
  private static final Polynomial<Q> SEVEN = RING.monomial(Q.SEVEN, 0);
  private static final Polynomial<Q> P13 = RING.monomial(new Q(13), 0);
  private static final Polynomial<Q> P27 = RING.monomial(new Q(27), 0);
  private int mN = -1;
  private int mM = 0;

  protected Z b(final int n, final int k) {
    if (n == 0) {
      return k == 0 ? Z.ONE : Z.ZERO;
    }
    final CycleIndex zn = SymmetricGroup.create(n).cycleIndex();
    // Z(S_n; 27+5*x, 27+5*x^2, ...)
    final List<Polynomial<Q>> s1 = new ArrayList<>();
    for (int j = 1; j <= n; ++j) {
      s1.add(RING.add(P27, RING.monomial(Q.FIVE, j)));
    }
    final Q q1 = zn.apply(s1, Z.valueOf(k)).coeff(k);
    // 10*Z(S_n; 13+3*x, 27+5*x^2, 13+3*x^3, 27+5*x^4, ...)
    final List<Polynomial<Q>> s2 = new ArrayList<>();
    for (int j = 1; j <= n; ++j) {
      if ((j & 1) == 1) {
        s2.add(RING.add(P13, RING.monomial(Q.THREE, j)));
      } else {
        s2.add(RING.add(P27, RING.monomial(Q.FIVE, j)));
      }
    }
    final Q q2 = zn.apply(s2, Z.valueOf(k)).coeff(k).multiply(10);
    // 15*Z(S_n; 7+x, 27+5*x^2, 7+x^3, 27+5*x^4, ...)
    final List<Polynomial<Q>> s3 = new ArrayList<>();
    for (int j = 1; j <= n; ++j) {
      if ((j & 1) == 1) {
        s3.add(RING.add(SEVEN, RING.monomial(Q.ONE, j)));
      } else {
        s3.add(RING.add(P27, RING.monomial(Q.FIVE, j)));
      }
    }
    final Q q3 = zn.apply(s3, Z.valueOf(k)).coeff(k).multiply(15);
    // 20*Z(S_n; 6+2*x, 6+2*x^2, 27+5*x^3, 6+2*x^4, 6+2*x^5, 27+5*x^6, ...)
    final List<Polynomial<Q>> s4 = new ArrayList<>();
    for (int j = 1; j <= n; ++j) {
      if ((j % 3) != 0) {
        s4.add(RING.add(SIX, RING.monomial(Q.TWO, j)));
      } else {
        s4.add(RING.add(P27, RING.monomial(Q.FIVE, j)));
      }
    }
    final Q q4 = zn.apply(s4, Z.valueOf(k)).coeff(k).multiply(20);
    // 20*Z(S_n; 4, 6+2*x^2, 13+3*x^3, 6+2*x^4, 4, 27+5*x^6, 4, 6+2*x^8, 13+3*x^9, 6+2*x^10, 4, 27+5*x^12, ...)
    final List<Polynomial<Q>> s5 = new ArrayList<>();
    for (int j = 1; j <= n; ++j) {
      switch (j % 6) {
        case 1:
        case 5:
          s5.add(FOUR);
          break;
        case 2:
        case 4:
          s5.add(RING.add(SIX, RING.monomial(Q.TWO, j)));
          break;
        case 3:
          s5.add(RING.add(P13, RING.monomial(Q.THREE, j)));
          break;
        default: // 0
          s5.add(RING.add(P27, RING.monomial(Q.FIVE, j)));
          break;
      }
    }
    final Q q5 = zn.apply(s5, Z.valueOf(k)).coeff(k).multiply(20);
    // 30*Z(S_n; 3+x, 7+x^2, 3+x^3, 27+5*x^4, 3+x^5, 7+x^6, 3+x^7, 27+5*x^8, ...)
    final List<Polynomial<Q>> s6 = new ArrayList<>();
    for (int j = 1; j <= n; ++j) {
      switch (j & 3) {
        case 1:
        case 3:
          s6.add(RING.add(THREE, RING.monomial(Q.ONE, j)));
          break;
        case 2:
          s6.add(RING.add(SEVEN, RING.monomial(Q.ONE, j)));
          break;
        default: // 0
          s6.add(RING.add(P27, RING.monomial(Q.FIVE, j)));
          break;
      }
    }
    final Q q6 = zn.apply(s6, Z.valueOf(k)).coeff(k).multiply(30);
    // 24*Z(S_n; 2, 2, 2, 2, 27+5*x^5, 2, 2, 2, 2, 27+5*x^10, ...)
    final List<Polynomial<Q>> s7 = new ArrayList<>();
    for (int j = 1; j <= n; ++j) {
      if ((j % 5) != 0) {
        s7.add(TWO);
      } else {
        s7.add(RING.add(P27, RING.monomial(Q.FIVE, j)));
      }
    }
    final Q q7 = zn.apply(s7, Z.valueOf(k)).coeff(k).multiply(24);
    return q1.add(q2).add(q3).add(q4).add(q5).add(q6).add(q7).divide(120).toZ();
  }

  private Z t(final int n, final int k) {
    return b(n, k).subtract(b(n - 1, k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN == 0) {
        return Z.ONE;
      }
      mM = 0;
    }
    return t(mN, mM);
  }
}
