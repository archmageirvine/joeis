package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A071531.
 * @author Sean A. Irvine
 */
public class A071538 extends A001359 {

  private long mP = super.next().longValueExact();
  private long mN = 0;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (++mN == mP) {
      mCount = mCount.add(1);
      mP = super.next().longValueExact();
    }
    return mCount;
  }
}
