package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078204.
 * @author Sean A. Irvine
 */
public class A078232 extends Sequence1 {

  private final Z mStart;
  private Z mA = null;

  protected A078232(final Z start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A078232() {
    this(Z.TWO);
  }

  private boolean is(final Z n) {
    Z m = n;
    while (!m.isZero()) {
      final Z[] qr = m.divideAndRemainder(Z.TEN);
      final int r = qr[1].intValue();
      if (((0b1101010011 >>> r) & 1) != 0) {
        return false;
      }
      m = qr[0];
    }
    return true;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mStart;
    } else {
      Z t = mA;
      while (true) {
        t = t.add(mA);
        if (is(t)) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}

