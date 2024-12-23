package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A073655.
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

