package irvine.oeis.a000;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a001.A001190;

/**
 * A000671 Number of boron trees with n nodes, i.e. n-node rooted trees with degree &lt;= 3 at root and out-degree &lt;= 2 elsewhere.
 * @author Sean A. Irvine
 */
public class A000671 extends A001190 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mA1190 = RING.zero();
  private final CycleIndex mZS3 = SymmetricGroup.create(3).cycleIndex();

  @Override
  public Z next() {
    mA1190 = RING.add(mA1190, RING.monomial(new Q(super.next()), mN));
    return mZS3.apply(mA1190, mN + 2).coeff(mN + 2).toZ();
  }
}

