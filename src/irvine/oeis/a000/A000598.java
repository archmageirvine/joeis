package irvine.oeis.a000;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000598 Number of rooted ternary trees with n nodes; number of n-carbon alkyl radicals C(n)H(2n+1) ignoring stereoisomers.
 * @author Sean A. Irvine
 */
public class A000598 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000598(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000598() {
    super(0);
  }

  private static final CycleIndex CYCLE_INDEX = SymmetricGroup.create(3).cycleIndex();
  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  protected int mN = -1;
  protected Polynomial<Q> mG = RING.zero();

  protected CycleIndex cycleIndex() {
    return CYCLE_INDEX;
  }

  protected int limit() {
    return mN;
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

