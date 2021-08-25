package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a004.A004001;

/**
 * A051135 a(n) = number of times n appears in the Hofstadter-Conway $10000 sequence A004001.
 * @author Sean A. Irvine
 */
public class A051135 extends A004001 {

  private Z mA = super.next();
  private Z mN = Z.ZERO;

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
