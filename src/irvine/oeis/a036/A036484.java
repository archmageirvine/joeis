package irvine.oeis.a036;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002182;

/**
 * A036484 a(n) is the minimal number of binary order n which has maximal number of divisors in this interval.
 * @author Sean A. Irvine
 */
public class A036484 extends AbstractSequence {

  private final A002182 mSeq1 = new A002182();

  /** Construct the sequence. */
  public A036484() {
    super(0);
  }

  private final PrimeDivision mFactor = new PrimeDivision();
  private Z mLim = null;
  private Z mA = mSeq1.next();

  @Override
  public Z next() {
    mLim = mLim == null ? Z.ONE : mLim.multiply2();
    Z sigma0 = Z.ZERO;
    Z bestA = Z.ZERO;
    while (mA.compareTo(mLim) <= 0) {
      final Z s = mFactor.factorize(mA).sigma0();
      if (s.compareTo(sigma0) > 0) {
        sigma0 = s;
        bestA = mA;
      }
      mA = mSeq1.next();
    }
    return bestA;
  }
}

