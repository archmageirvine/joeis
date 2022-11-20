package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060412 In the '3x+1' problem, these values for the starting value set new records for the "dropping time", number of steps to reach a lower value than the start.
 * @author Sean A. Irvine
 */
public class A060412 extends Sequence1 {

  private Z mN = Z.ONE;
  private long mMax = 0;

  static long droppingTime(final Z n) {
    Z m = n;
    long cnt = 0;
    while (m.compareTo(n) >= 0) {
      m = m.isEven() ? m.divide2() : m.multiply(3).add(1).divide2();
      ++cnt;
    }
    return cnt;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final long cnt = droppingTime(mN);
      if (cnt > mMax) {
        mMax = cnt;
        return mN;
      }
    }
  }
}
