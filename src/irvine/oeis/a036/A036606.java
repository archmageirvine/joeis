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
  private final CycleIndex mSym;
  private final int mHeight;
  protected Polynomial<Q> mA = null;
  protected int mM = 0;

  protected A036606(final int ary, final int height) {
    mHeight = height;
    mSym = SymmetricGroup.create(ary).cycleIndex();
  }

  /** Construct the sequence. */
  public A036606() {
    this(4, 0);
  }

  protected void init() {
    if (mA == null) {
      mA = RING.zero();
      for (int h = 0; h < mHeight; ++h) {
        step();
      }
    }
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
    init();
    if (++mM > mA.degree()) {
      step();
    }
    return mA.coeff(mM).toZ();
  }
}
