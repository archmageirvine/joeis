package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a121.A121657;

/**
 * A049522 Smallest starting index for a run of at least n consecutive equal digits in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A049522 extends A121657 {

  private Z mA = super.next();
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    mM = mM.add(1);
    while (mA.compareTo(mM) < 0) {
      mA = super.next();
    }
    return Z.valueOf(mN).subtract(mA);
  }
}

