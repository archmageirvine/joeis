package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068103 Smallest prime starting with at least n 2s.
 * @author Sean A. Irvine
 */
public class A068103 extends Sequence0 {

  private Z mA;
  private final long mRepeat;
  private int mN = -1;

  protected A068103(final long repeat) {
    mRepeat = repeat;
    mA = Z.valueOf(mRepeat);
  }

  /** Construct the sequence. */
  public A068103() {
    this(2);
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.TWO : mA;
    }
    mA = mA.multiply(10).add(mRepeat);
    long lim = 10;
    long k = -1;
    Z t = mA.multiply(10);
    while (true) {
      k += 2;
      if (k >= lim) {
        lim *= 10;
        t = t.multiply(10);
        k = 1;
      }
      final Z u = t.add(k);
      if (u.isProbablePrime()) {
        return u;
      }
    }
  }
}

