package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A073899 a(1) = 1; then k-th prime prime(k) followed by prime(k) consecutive composite numbers not occurring earlier.
 * @author Sean A. Irvine
 */
public class A073899 extends Sequence1 {

  private final A000040 mPrimes = new A000040();
  private final A002808 mComposites = new A002808();
  private long mN = -2;

  @Override
  public Z next() {
    if (mN == -2) {
      mN = 0;
      return Z.ONE;
    }
    if (--mN < 0) {
      final Z p = mPrimes.next();
      mN = p.longValueExact();
      return p;
    }
    return mComposites.next();
  }
}

