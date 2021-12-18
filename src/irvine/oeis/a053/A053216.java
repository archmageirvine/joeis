package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a001.A001156;

/**
 * A053192.
 * @author Sean A. Irvine
 */
public class A053216 extends A001156 {

  private Z mN = Z.ZERO;
  private Z mA = super.next();

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    while (mA.equals(mN)) {
      ++cnt;
      mA = super.next();
    }
    return Z.valueOf(cnt);
  }
}
