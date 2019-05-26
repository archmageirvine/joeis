package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;
import irvine.oeis.a001.A001918;

/**
 * A023048 Smallest prime having least positive primitive root n, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A023048 extends A001597 {

  private Z mN = Z.ZERO;
  {
    super.next(); // skip 1
  }
  private Z mA = super.next();

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mA.equals(mN)) {
      mA = super.next();
      return Z.ZERO;
    }
    final A001918 s = new A001918();
    while (!mN.equals(s.next())) {
      // do nothing
    }
    return s.getP();
  }
}
