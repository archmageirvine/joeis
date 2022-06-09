package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057469 Prime numbers k such that (2^k + 3^k)/5 is prime.
 * @author Sean A. Irvine
 */
public class A057469 extends A000040 {

  {
    super.next(); // skip 2
  }

  @Override
  public Z next() {
    while (true) {
      final Z zp = super.next();
      final int p = zp.intValueExact();
      if (Z.THREE.pow(p).add(Z.ONE.shiftLeft(p)).divide(5).isProbablePrime()) {
        return zp;
      }
    }
  }
}
