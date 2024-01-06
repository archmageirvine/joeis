package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067783 Numbers k such that prime(k+1)^2 == prime(k)^2 (mod k).
 * @author Sean A. Irvine
 */
public class A067783 extends A000040 {

  private long mN = 0;
  private Z mP2 = super.next().square();

  @Override
  public Z next() {
    while (true) {
      final Z q2 = mP2;
      mP2 = super.next().square();
      if (q2.mod(++mN) == mP2.mod(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
