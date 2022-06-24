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
 * A057669 Triangle T(n,k) of number of minimal 3-covers of an unlabeled n+3-set that cover k points of that set uniquely (k=3,..,n+3).
 * @author Sean A. Irvine
 */
public class A057669 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO = RING.monomial(Q.TWO, 0);
  private static final Polynomial<Q> THREE = RING.monomial(Q.THREE, 0);
  private static final Polynomial<Q> FIVE = RING.monomial(Q.FIVE, 0);
  private int mN = -1;
  private int mM = 0;

  private Z b(final int n, final int k) {
    if (n == 0) {
      return k == 0 ? Z.ONE : Z.ZERO;
    }
    final CycleIndex zn = SymmetricGroup.create(n).cycleIndex();
    final List<Polynomial<Q>> s1 = new ArrayList<>();
    for (int j = 1; j <= n; ++j) {
      s1.add(RING.add(FIVE, RING.monomial(Q.THREE, j)));
    }
    final Q q1 = zn.apply(s1, Z.valueOf(k)).coeff(k);
    final List<Polynomial<Q>> s2 = new ArrayList<>();
    for (int j = 1; j <= n; ++j) {
      if ((j & 1) == 1) {
        s2.add(RING.add(THREE, RING.monomial(Q.ONE, j)));
      } else {
        s2.add(RING.add(FIVE, RING.monomial(Q.THREE, j)));
      }
    }
    final Q q2 = zn.apply(s2, Z.valueOf(k)).coeff(k).multiply(3);
    final List<Polynomial<Q>> s3 = new ArrayList<>();
    for (int j = 1; j <= n; ++j) {
      if (j % 3 != 0) {
        s3.add(TWO);
      } else {
        s3.add(RING.add(FIVE, RING.monomial(Q.THREE, j)));
      }
    }
    final Q q3 = zn.apply(s3, Z.valueOf(k)).coeff(k).multiply(2);
    return q1.add(q2).add(q3).divide(6).toZ();
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
