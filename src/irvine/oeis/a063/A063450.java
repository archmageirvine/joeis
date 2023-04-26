package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A063450 Numbers n such that d(n+1) &lt; 2d(n), where d() is the number of divisors function A000005.
 * @author Sean A. Irvine
 */
public class A063450 extends A000005 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z b = mA;
      mA = super.next();
      if (b.multiply2().compareTo(mA) > 0) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
