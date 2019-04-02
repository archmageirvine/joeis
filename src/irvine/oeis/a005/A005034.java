package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.math.group.CyclicGroup;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a001.A001764;

/**
 * A005034 Number of nonequivalent dissections of a polygon into n quadrilaterals by nonintersecting diagonals up to rotation.
 * @author Sean A. Irvine
 */
public class A005034 extends A001764 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final CycleIndex mC4 = new CyclicGroup(4).cycleIndex();
  private final ArrayList<Q> mU = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mU.add(new Q(super.next()));
    final Polynomial<Q> u = RING.create(mU);
    final Polynomial<Q> u2 = u.substitutePower(2, mN);
    final Z a = RING.pow(u, 2, mN).coeff(mN).subtract(u2.coeff(mN)).toZ().divide2();
    return mC4.apply(u, mN).coeff(mN - 1).toZ().subtract(a);
  }
}

