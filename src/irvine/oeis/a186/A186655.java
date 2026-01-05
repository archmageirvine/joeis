package irvine.oeis.a186;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a047.A047716;

/**
 * A186655 Total number of positive integers below 10^n requiring 5 positive biquadrates in their representation as sum of biquadrates.
 * @author Sean A. Irvine
 */
public class A186655 extends Sequence1 {

  private final Sequence mS = new A047716();
  private Z mA = mS.next();
  private Z mLim = Z.ONE;
  private long mCount = 0;

  @Override
  public Z next() {
    mLim = mLim.multiply(10);
    while (mA.compareTo(mLim) < 0) {
      ++mCount;
      mA = mS.next();
    }
    return Z.valueOf(mCount);
  }
}
