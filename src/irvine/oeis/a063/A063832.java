package irvine.oeis.a063;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000598;

/**
 * A063832 Number of structurally isomeric homologs with molecular formula C_{3+n} H_{6+2n}.
 * @author Sean A. Irvine
 */
public class A063832 extends A000598 {

  private static final CycleIndex S2 = SymmetricGroup.create(2).cycleIndex();
  private static final CycleIndex S3 = SymmetricGroup.create(3).cycleIndex();
  private static final CycleIndex S3_S2 = S3.wreath(S2);
  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mB = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mB.add(new Q(super.next()));
    return S3_S2.apply(mB, ++mN).coeff(mN).toZ();
  }
}

