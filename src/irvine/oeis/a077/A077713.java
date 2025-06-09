package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077713 a(1) = 3; thereafter a(n) = the smallest prime of the form d0...0a(n-1), where d is a single digit, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A077713 extends Sequence1 {

  private final Z mStart;
  private Z mA = null;

  protected A077713(final Z start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A077713() {
    this(Z.THREE);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mStart;
      return mStart;
    }
    Z m = Z.TEN.pow(Functions.DIGIT_LENGTH.l(mA));
    while (true) {
      for (long k = 1; k < 10; ++k) {
        final Z t = m.multiply(k).add(mA);
        if (t.isProbablePrime()) {
          mA = t;
          return mA;
        }
      }
      m = m.multiply(10);
    }
  }
}
