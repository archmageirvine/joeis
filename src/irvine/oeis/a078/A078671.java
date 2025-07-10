package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000215;

/**
 * A078671 Number of times the n-th prime appears among the decimal digits of 2^(2^n) + 1, the Fermat numbers.
 * @author Sean A. Irvine
 */
public class A078671 extends A000040 {

  private final Sequence mA = new A000215().skip();
  private long mMod = 10;

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    if (p >= mMod) {
      mMod *= 10;
    }
    Z t = mA.next();
    long cnt = 0;
    while (!t.isZero()) {
      if (t.mod(mMod) == p) {
        ++cnt;
      }
      t = t.divide(10);
    }
    return Z.valueOf(cnt);
  }
}
