package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A052317 Number of labeled trees with n nodes and 2-colored internal (non-leaf) nodes.
 * @author Sean A. Irvine
 */
public class A052317 extends A052316 {

  /** Construct the sequence. */
  public A052317() {
    super(0);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mB = RING.empty();
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mB.add(Q.ZERO);
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    mB.add(new Q(super.next(), mF));
    final Q t = mB.get(mN).subtract(mB.get(mN - 1)).subtract(RING.pow(mB, 2, mN).coeff(mN).divide(2));
    return t.multiply(mF).toZ();
  }
}

