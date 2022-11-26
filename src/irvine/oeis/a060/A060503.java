package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A060503 Primes p that have a primitive root between 0 and p that is not a primitive root of p^2.
 * @author Sean A. Irvine
 */
public class A060503 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z pp = p.square();
      for (Z k = Z.ONE; k.compareTo(p) < 0; k = k.add(1)) {
        if (ZUtils.isPrimitiveRoot(k, p) && !ZUtils.isPrimitiveRoot(k, pp)) {
          return p;
        }
      }
    }
  }
}
