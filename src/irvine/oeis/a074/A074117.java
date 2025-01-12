package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074117 Smallest n-digit power of 3.
 * @author Sean A. Irvine
 */
public class A074117 extends Sequence1 {

  private Z mMin = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mMin = mMin == null ? Z.ONE : mMin.multiply(10);
    while (mA.compareTo(mMin) < 0) {
      mA = mA.multiply(3);
    }
    return mA;
  }
}
