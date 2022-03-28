package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a002.A002997;

/**
 * A055553 Number of Carmichael numbers (A002997) less than 10^n.
 * @author Sean A. Irvine
 */
public class A055553 extends A002997 {

  private long mA = super.next().longValueExact();
  private long mLimit = 1;
  private long mCount = 0;

  @Override
  public Z next() {
    mLimit *= 10;
    while (mA < mLimit) {
      ++mCount;
      mA = super.next().longValueExact();
    }
    return Z.valueOf(mCount);
  }
}
