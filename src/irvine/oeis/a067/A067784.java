package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067784 Numbers k such that prime(k+1)^4 == prime(k)^4 (mod k).
 * @author Sean A. Irvine
 */
public class A067784 extends A000040 {

  private long mN = 0;
  private Z mQ = super.next().pow(4);

  @Override
  public Z next() {
    while (true) {
      final Z q = mQ;
      mQ = super.next().pow(4);
      if (q.mod(++mN) == mQ.mod(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
