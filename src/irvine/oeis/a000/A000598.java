package irvine.oeis.a000;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000598.
 * @author Sean A. Irvine
 */
public class A000598 implements Sequence {

  private static final CycleIndex CYCLE_INDEX = SymmetricGroup.create(3).cycleIndex();
  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  protected int mN = -1;
  protected Polynomial<Q> mG = RING.zero();

  protected CycleIndex cycleIndex() {
    return CYCLE_INDEX;
  }

  protected int limit() {
    return mN + 2;
  }

  /**
   * Polynomial associated with this sequence.
   * @return polynomial
   */
  public Polynomial<Q> g() {
    return mG;
  }

  @Override
  public Z next() {
    ++mN;
    mG = RING.add(RING.one(), RING.shift(cycleIndex().apply(mG, limit()), 1));
    return mG.coeff(mN).toZ();
  }
}

