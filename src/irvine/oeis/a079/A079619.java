package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A079619 Look at and say the digits of Pi.
 * @author Sean A. Irvine
 */
public class A079619 extends A000796 {

  private Z mA = null;
  private Z mT = super.next();

  @Override
  public Z next() {
    if (mA != null) {
      final Z r = mA;
      mA = null;
      return r;
    }
    long cnt = 1;
    mA = mT;
    while ((mT = super.next()).equals(mA)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

