package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024363.
 * @author Sean A. Irvine
 */
public class A024363 extends A024357 {

  private Z mA = super.next();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    long c = 0;
    mN = mN.add(1);
    while (mN.equals(mA)) {
      ++c;
      mA = super.next();
    }
    return Z.valueOf(c);
  }
}
