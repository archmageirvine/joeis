package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A045924 Numbers n such that prime(n) == -1 (mod n).
 * @author Sean A. Irvine
 */
public class A045924 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.mod(++mN) == mN - 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
