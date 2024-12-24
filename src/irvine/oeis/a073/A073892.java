package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A073892 a(1) = 1, a(2n) = a(2n-1) + p(n) and a(2n+1) = a(2n) - c(n), where p(n)=A000040(n) and c(n)=A002808(n) are the n-th composite and n-th prime numbers, respectively.
 * @author Sean A. Irvine
 */
public class A073892 extends Sequence1 {

  private final A000040 mPrimes = new A000040();
  private final A002808 mComposites = new A002808();
  private Z mA = null;
  private boolean mSign = false;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    mSign = !mSign;
    if (mSign) {
      mA = mA.add(mPrimes.next());
    } else {
      mA = mA.subtract(mComposites.next());
    }
    return mA;
  }
}

