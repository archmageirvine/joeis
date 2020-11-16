package irvine.oeis.a036;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000598;

/**
 * A036670 G.f.: A(x) = x*cycle_index(S5, B(x)-1), where B(x) is g.f. for A000598.
 * @author Sean A. Irvine
 */
public class A036670 extends A000598 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final CycleIndex S5 = SymmetricGroup.create(5).cycleIndex();
  private final Polynomial<Q> mG = RING.empty();
  private int mN = -1;
  {
    super.next();
  }

  @Override
  public Z next() {
    mG.add(new Q(super.next()));
    return S5.apply(mG, ++mN - 6).shift(6).coeff(mN).toZ();
  }
}
