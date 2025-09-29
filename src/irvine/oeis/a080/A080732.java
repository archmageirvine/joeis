package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a246.A246655;

/**
 * A080732 Smallest distance from n to a prime power (as defined in A246655).
 * @author Sean A. Irvine
 */
public class A080732 extends A246655 {

  private long mA = 0;
  private long mB = super.next().longValueExact();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN >= mB) {
      mA = mB;
      mB = super.next().longValueExact();
    }
    return Z.valueOf(Math.min(mN - mA, mB - mN));
  }
}
