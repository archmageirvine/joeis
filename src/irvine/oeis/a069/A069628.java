package irvine.oeis.a069;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069628 a(1) = 1; a(2n) = smallest prime starting (most significant digits) with a(2n-1). a(2n+1) = smallest prime ending (least significant digits) in a(2n).
 * @author Sean A. Irvine
 */
public class A069628 extends Sequence1 {

  private final Z mStart;
  private Z mA = null;
  private boolean mStarting = false;

  protected A069628(final Z start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A069628() {
    this(Z.ONE);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mStart;
    } else {
      mStarting = !mStarting;
      if (mStarting) {
        mA = Puma.smallestPrimeBeginningWith(mA.toString(), "X", false);
      } else {
        mA = Puma.smallestPrimeEndingWith(mA, false);
      }
    }
    return mA;
  }
}
