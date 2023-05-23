package irvine.oeis.a000;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A000633 Number of acyclic quaternary ammonium ions with n carbon atoms.
 * @author Sean A. Irvine
 */
public class A000633 extends A000598 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final CycleIndex S4 = SymmetricGroup.create(4).cycleIndex();
  private final Polynomial<Q> mG = RING.empty();
  private int mN = -1;
  {
    super.next();
  }

  @Override
  public Z next() {
    mG.add(new Q(super.next()));
    return S4.apply(mG, ++mN).coeff(mN).toZ();
  }
}
