package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067785 Numbers k such that prime(k)^3 == prime(k+1)^3 (mod k).
 * @author Sean A. Irvine
 */
public class A067785 extends A000040 {

  private long mN = 0;
  private Z mQ = super.next().pow(3);

  @Override
  public Z next() {
    while (true) {
      final Z q = mQ;
      mQ = super.next().pow(3);
      if (q.mod(++mN) == mQ.mod(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
