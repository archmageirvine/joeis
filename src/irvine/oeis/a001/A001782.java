package irvine.oeis.a001;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001782 Discriminants of Shapiro polynomials.
 * @author Sean A. Irvine
 */
public class A001782 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mP = RING.one();
  private Polynomial<Q> mQ = RING.one();

  @Override
  public Z next() {
    if (++mN > 31) {
      throw new UnsupportedOperationException();
    }
    final Polynomial<Q> t = RING.shift(mQ, 1 << mN);
    mQ = RING.subtract(mP, t);
    mP = RING.add(mP, t);
    final Q disc = RING.discriminant(mP);
    assert disc.isInteger();
    return disc.toZ();
  }
}
