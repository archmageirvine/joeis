package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a007.A007519;

/**
 * A064496 a(n) is the least k such that k * A007519(n) + 1 = 0 (mod 12).
 * @author Sean A. Irvine
 */
public class A064496 extends A007519 {

  @Override
  public Z next() {
    final Z p = super.next();
    long k = 3;
    while (true) {
      k += 4;
      if (p.multiply(k).mod(12) == 11) {
        return Z.valueOf(k);
      }
    }
  }
}
