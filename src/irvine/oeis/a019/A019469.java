package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A019469 Numbers n such that n does not divide binomial(2*n-4, <code>n-2)</code>.
 * @author Sean A. Irvine
 */
public class A019469 extends A000108 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (c.mod(++mN) != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
