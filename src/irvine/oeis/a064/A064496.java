package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a007.A007519;

/**
 * A064496 Values of n such that 4j = np+1 where p = 8x+1, x integer, p prime and j mod 3 = 0.
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
