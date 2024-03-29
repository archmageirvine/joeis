package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049490 a(n) and a(n)+64 both prime.
 * @author Sean A. Irvine
 */
public class A049490 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(64).isProbablePrime()) {
        return p;
      }
    }
  }
}
