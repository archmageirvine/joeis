package irvine.oeis.a036;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a001.A001190;

/**
 * A036661 Number of n-node rooted labeled trees with deg &lt;=4 at root and out-degree &lt;=2 elsewhere.
 * @author Sean A. Irvine
 */
public class A036661 extends A001190 {

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
