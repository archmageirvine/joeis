package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067697 Numbers k such that prime(k) == 1 (mod sigma(k)).
 * @author Sean A. Irvine
 */
public class A067697 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.subtract(1).mod(Jaguar.factor(++mN).sigma()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
