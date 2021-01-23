package irvine.oeis.a036;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A036658 Number of n-node rooted unlabeled trees with exactly 3 edges at root and otherwise out-degree &lt;= 2.
 * @author Sean A. Irvine
 */
public class A036658 extends A036656 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final CycleIndex S3 = SymmetricGroup.create(3).cycleIndex();
  private final Polynomial<Q> mG = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mG.add(new Q(super.next()));
    return S3.apply(mG, mN - 4).shift(4).coeff(mN).toZ();
  }
}
