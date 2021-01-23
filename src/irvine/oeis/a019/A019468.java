package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A019468 (n-2)-th Catalan number is congruent to 2n/3 mod n.
 * @author Sean A. Irvine
 */
public class A019468 extends A000108 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      super.next();
      final Z c = super.next();
      super.next();
      if (c.mod(3 * ++mN) == 2 * mN) {
        return Z.valueOf(3 * mN);
      }
    }
  }
}
