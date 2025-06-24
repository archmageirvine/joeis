package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078236 a(1) = 4, a(n+1) = smallest multiple of a(n) using only composite digits (4,6,8,9,0) and which is not divisible by 10.
 * @author Sean A. Irvine
 */
public class A078236 extends Sequence1 {

  private final Z mStart;
  private Z mA = null;

  protected A078236(final Z start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A078236() {
    this(Z.FOUR);
  }

  private boolean is(final Z n) {
    if (n.mod(10) == 0) {
      return false;
    }
    Z m = n;
    while (!m.isZero()) {
      final Z[] qr = m.divideAndRemainder(Z.TEN);
      final int r = qr[1].intValue();
      if (((0b0010101110 >>> r) & 1) != 0) {
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

