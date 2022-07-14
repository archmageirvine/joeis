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
import irvine.oeis.Sequence;

/**
 * A057967 Triangle T(n,k) of numbers of minimal 4-covers of an unlabeled n+4-set that cover k points of that set uniquely (k=4,..,n+4).
 * @author Sean A. Irvine
 */
public class A057967 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO = RING.monomial(Q.TWO, 0);
  private static final Polynomial<Q> THREE = RING.monomial(Q.THREE, 0);
  private static final Polynomial<Q> FOUR = RING.monomial(Q.FOUR, 0);
  private static final Polynomial<Q> SIX = RING.monomial(Q.SIX, 0);
  private static final Polynomial<Q> TWELVE = RING.monomial(new Q(12), 0);
  private int mN = -1;
  private int mM = 0;

  private Z b(final int n, final int k) {
    if (n == 0) {
      return k == 0 ? Z.ONE : Z.ZERO;
    }
    final CycleIndex zn = SymmetricGroup.create(n).cycleIndex();
    // Z(S_n; 12 + 4*x, 12 + 4*x^2, ...)
    final List<Polynomial<Q>> s1 = new ArrayList<>();
    for (int j = 1; j <= n; ++j) {
      s1.add(RING.add(TWELVE, RING.monomial(Q.FOUR, j)));
    }
    final Q q1 = zn.apply(s1, Z.valueOf(k)).coeff(k);
    // 8*Z(S_n; 3 + x, 3 + x^2, 12 + 4*x^3, 3 + x^4, 3 + x^5, 12 + 4*x^6, ...)
    final List<Polynomial<Q>> s2 = new ArrayList<>();
    for (int j = 1; j <= n; ++j) {
      if ((j % 3) != 0) {
        s2.add(RING.add(THREE, RING.monomial(Q.ONE, j)));
      } else {
        s2.add(RING.add(TWELVE, RING.monomial(Q.FOUR, j)));
      }
    }
    final Q q2 = zn.apply(s2, Z.valueOf(k)).coeff(k).multiply(8);
    // 6*Z(S_n; 6 + 2*x, 12 + 4*x^2, 6 + 2*x^3, 12 + 4*x^4, ...)
    final List<Polynomial<Q>> s3 = new ArrayList<>();
    for (int j = 1; j <= n; ++j) {
      if ((j & 1) == 1) {
        s3.add(RING.add(SIX, RING.monomial(Q.TWO, j)));
      } else {
        s3.add(RING.add(TWELVE, RING.monomial(Q.FOUR, j)));
      }
    }
    final Q q3 = zn.apply(s3, Z.valueOf(k)).coeff(k).multiply(6);
    // 3*Z(S_n; 4, 12 + 4*x^2, 4, 12 + 4*x^4, ...)
    final List<Polynomial<Q>> s4 = new ArrayList<>();
    for (int j = 1; j <= n; ++j) {
      if ((j & 1) == 1) {
        s4.add(FOUR);
      } else {
        s4.add(RING.add(TWELVE, RING.monomial(Q.FOUR, j)));
      }
    }
    final Q q4 = zn.apply(s4, Z.valueOf(k)).coeff(k).multiply(3);
    // 6*Z(S_n; 2, 4, 2, 12 + 4*x^4, 2, 4, 2, 12 + 4*x^8, ...)
    final List<Polynomial<Q>> s5 = new ArrayList<>();
    for (int j = 1; j <= n; ++j) {
      switch (j & 3) {
        case 1:
        case 3:
          s5.add(TWO);
          break;
        case 2:
          s5.add(FOUR);
          break;
        default: // 0
          s5.add(RING.add(TWELVE, RING.monomial(Q.FOUR, j)));
          break;
      }
    }
    final Q q5 = zn.apply(s5, Z.valueOf(k)).coeff(k).multiply(6);
    return q1.add(q2).add(q3).add(q4).add(q5).divide(24).toZ();
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
