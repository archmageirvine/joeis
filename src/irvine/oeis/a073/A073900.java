package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A073900 a(1) = 1; then k-th prime prime(k) followed by Floor[e^k] consecutive composite numbers not occurring earlier.
 * @author Sean A. Irvine
 */
public class A073900 extends Sequence1 {

  private final A000040 mPrimes = new A000040();
  private final A002808 mComposites = new A002808();
  private long mM = 0;
  private long mN = -1;

  @Override
  public Z next() {
    if (--mM < 0) {
      if (++mN == 0) {
        return Z.ONE;
      }
      mM = CR.valueOf(mN).exp().floor().longValueExact();
      return mPrimes.next();
    }
    return mComposites.next();
  }
}

