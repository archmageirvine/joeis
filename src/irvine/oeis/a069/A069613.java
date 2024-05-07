package irvine.oeis.a069;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069613 a(1) = 1; a(2n) = smallest prime starting ( the most significant digits) with a(2n-1). and a(2n+1) = smallest prime ending in ( the least significant digits) a(2n-1). Alternate left and right concatenation yielding primes.
 * @author Sean A. Irvine
 */
public class A069613 extends Sequence1 {

  private final Z mStart;
  private Z mA = null;
  private boolean mStarting = false;

  protected A069613(final Z start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A069613() {
    this(Z.ONE);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mStart;
    } else {
      mStarting = !mStarting;
      if (mStarting) {
        mA = Puma.smallestPrimeBeginningWith(mA.toString(), "0", false);
      } else {
        mA = Puma.smallestPrimeEndingWith(mA, false);
      }
    }
    return mA;
  }
}
