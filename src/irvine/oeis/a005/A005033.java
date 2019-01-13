package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.math.group.CyclicGroup;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CycleIndex;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a001.A001764;

/**
 * A005033.
 * @author Sean A. Irvine
 */
public class A005033 extends A001764 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final CycleIndex mC4 = new CyclicGroup(4).cycleIndex();
  private final ArrayList<Q> mU = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    mU.add(new Q(super.next()));
    return mC4.apply(RING.create(mU), ++mN).coeff(mN).toZ();
  }
}

