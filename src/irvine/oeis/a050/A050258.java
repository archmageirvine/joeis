package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a007.A007530;

/**
 * A050258 Number of "prime quadruplets" with largest member &lt; 10^n.
 * @author Sean A. Irvine
 */
public class A050258 extends A007530 {

  private Z mLim = Z.ONE;
  private Z mA = super.next().add(8);
  private long mCount = 0;

  @Override
  public Z next() {
    mLim = mLim.multiply(10);
    while (mA.compareTo(mLim) < 0) {
      ++mCount;
      mA = super.next().add(8);
    }
    return Z.valueOf(mCount);
  }
}

