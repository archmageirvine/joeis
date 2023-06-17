package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A051145 a(0)=0, a(1)=1, a(n) = smallest number such that sequence b(n) = a(n) OR a(n+1) is strictly monotonically increasing.
 * @author Sean A. Irvine
 */
public class A051145 extends AbstractSequence {

  private Z mA = null;
  private Z mB = null;
  private final Z mFirstTerm;
  private final Z mSecondTerm;

  protected A051145(final Z firstTerm, final Z secondTerm) {
    super(0);
    mFirstTerm = firstTerm;
    mSecondTerm = secondTerm;
  }

  /** Construct the sequence. */
  public A051145() {
    this(Z.ZERO, Z.ONE);
  }

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = mFirstTerm;
        return mFirstTerm;
      }
      mB = mSecondTerm;
      return mSecondTerm;
    }
    final Z t = mB.or(mA).add(1).and(mB.not());
    mA = mB;
    mB = t;
    return t;
  }
}
