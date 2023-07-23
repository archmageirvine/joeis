package irvine.oeis.a036;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002182;

/**
 * A036451 Maximal value of d(x) (the number of divisors of x, A000005) if the binary order (see A029837) of x, the value g(x) = n.
 * @author Sean A. Irvine
 */
public class A036451 extends AbstractSequence {

  private final A002182 mSeq1 = new A002182();

  /** Construct the sequence. */
  public A036451() {
    super(0);
  }

  private final PrimeDivision mFactor = new PrimeDivision();
  private Z mLim = null;
  private Z mA = mSeq1.next();

  @Override
  public Z next() {
    mLim = mLim == null ? Z.ONE : mLim.multiply2();
    Z sigma0 = Z.ZERO;
    while (mA.compareTo(mLim) <= 0) {
      sigma0 = sigma0.max(mFactor.factorize(mA).sigma0());
      mA = mSeq1.next();
    }
    return sigma0;
  }
}

