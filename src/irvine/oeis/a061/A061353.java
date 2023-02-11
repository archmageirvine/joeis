package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061353 First column of array shown in A061352.
 * @author Sean A. Irvine
 */
public class A061353 extends Sequence1 {

  private Z mA = null;
  private long mN = 0;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      ++mN;
      if ((mN & 1) == 0) {
        mA = mA.add(1).mod(Z.TEN);
      } else {
        mA = mA.add(2L * mN).mod(Z.TEN);
      }
    }
    return mA;
  }
}

