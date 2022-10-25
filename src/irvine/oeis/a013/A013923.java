package irvine.oeis.a013;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A013923 Number of labeled connected graphs with n vertices and 1 cutpoint.
 * @author Sean A. Irvine
 */
public class A013923 extends A013922 {

  {
    setOffset(3);
    super.next();
  }
  private Polynomial<Q> mB = RING.monomial(new Q(super.next(), mF), mN);

  @Override
  public Z next() {
    mB = RING.add(mB, RING.monomial(new Q(super.next(), mF), mN));
    final Polynomial<Q> bp = RING.diff(mB);
    final Polynomial<Q> egf = RING.subtract(RING.exp(bp, mN), bp);
    return egf.coeff(mN - 1).multiply(mF).toZ();
  }
}
