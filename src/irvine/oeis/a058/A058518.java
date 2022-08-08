package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058518 Number of forests of B-trees of order 3 with n labeled leaves.
 * @author Sean A. Irvine
 */
public class A058518 implements Sequence {

  // Using maple can get egf for combstruct like this:
  // combstruct[gfeqns]({B=Union(Z, Subst(M, B)), M=Union(Prod(Z, Z), Prod(Z, Z, Z)), C=PowerSet(B)},unlabeled,z);

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> M = Polynomial.create(Q.ZERO, Q.ZERO, Q.ONE, Q.ONE);
  private int mN = -1;
  private Polynomial<Q> mB = RING.x();

  @Override
  public Z next() {
    ++mN;
    mB = RING.add(RING.x(), RING.substitute(mB, M, mN));
    final Polynomial<Q> c = RING.sum(1, mN, k -> RING.divide(mB.substitutePower(k, mN), new Q((k & 1) == 0 ? -k : k)));
    return RING.exp(c, mN).coeff(mN).toZ();
  }
}
