package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052525 Number of unlabeled rooted trees with n leaves in which the degrees of the root and all internal nodes are &gt;= 3.
 * @author Sean A. Irvine
 */
public class A052525 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mS = RING.zero();

  @Override
  public Z next() {
    if (++mN > 0) {
      final Polynomial<Q> b = RING.add(mS, RING.x());
      mS = RING.zero();
      for (int k = 1; k <= mN; ++k) {
        mS = RING.add(mS, RING.divide(b.substitutePower(k, mN), new Q(k)));
      }
      final Polynomial<Q> b2 = RING.divide(RING.add(b.substitutePower(2, mN), RING.pow(b, 2, mN)), Q.TWO);
      mS = RING.subtract(RING.subtract(RING.subtract(RING.exp(mS, mN), RING.one()), b), b2);
    }
    return mS.coeff(mN).toZ();
  }
}

