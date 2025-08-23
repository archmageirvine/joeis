package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a001.A001113;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A079620 extends A001113 {

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

