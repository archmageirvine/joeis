package irvine.oeis.a007;

import irvine.math.group.CyclicGroup;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a003.A003168;

/**
 * A007169 Number of Q-graphs rooted at a polygon.
 * @author Sean A. Irvine
 */
public class A007169 extends A003168 {

  /** Construct the sequence. */
  public A007169() {
    super(1);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private CycleIndex mCycleIndexSum = new CycleIndex("C");
  private Polynomial<Q> mB = RING.monomial(new Q(super.next()), 1);

  @Override
  public Z next() {
    mN += 2;
    mCycleIndexSum.add(new CyclicGroup(mN + 2).cycleIndex());
    mB = RING.add(mB, RING.monomial(new Q(super.next()), mN + 1));
    //System.out.println("u=" + u);
    final Polynomial<Q> u = mCycleIndexSum.apply(mB, mN + 1);
    return u.coeff(mN).toZ();
  }
}
