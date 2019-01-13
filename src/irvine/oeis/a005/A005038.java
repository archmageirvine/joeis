package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.math.group.CyclicGroup;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a002.A002293;

/**
 * A005038.
 * @author Sean A. Irvine
 */
public class A005038 extends A002293 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final CycleIndex mC5 = new CyclicGroup(5).cycleIndex();
  private final ArrayList<Q> mU = new ArrayList<>();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mU.add(new Q(super.next()));
    final Polynomial<Q> u = RING.create(mU);
    final Polynomial<Q> u2 = u.substitutePower(2, mN);
    final Z a = RING.pow(u, 2, mN).coeff(mN).subtract(u2.coeff(mN)).toZ().divide2();
    return mC5.apply(u, mN).coeff(mN - 1).toZ().subtract(a);
  }
}

