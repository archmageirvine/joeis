package irvine.oeis.a036;

import irvine.math.group.PolynomialRing;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036606 Triangle of coefficients of generating function of 4-ary rooted trees of height at most n.
 * @author Sean A. Irvine
 */
public class A036606 implements Sequence {

  protected static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);
  private final CycleIndex mSym = SymmetricGroup.create(ary()).cycleIndex();
  protected Polynomial<Q> mA = RING.zero();
  protected int mM = 0;

  protected int ary() {
    return 4;
  }

  protected void step() {
    if (RING.zero().equals(mA)) {
      mA = RING.one();
    } else {
      mA = RING.add(RING.one(), mSym.apply(mA, Integer.MAX_VALUE).shift(1));
    }
    mM = 0;
  }

  @Override
  public Z next() {
    if (++mM > mA.degree()) {
      step();
    }
    return mA.coeff(mM).toZ();
  }
}
