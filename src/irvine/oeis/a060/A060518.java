package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A060518 Primes p that have exactly two primitive roots that are not primitive roots mod p^2.
 * @author Sean A. Irvine
 */
public class A060518 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      int cnt = 0;
      final Z p = super.next();
      final Z pp = p.square();
      for (Z k = Z.ONE; k.compareTo(p) < 0; k = k.add(1)) {
        if (ZUtils.isPrimitiveRoot(k, p) && !ZUtils.isPrimitiveRoot(k, pp) && ++cnt > 2) {
          break;
        }
      }
      if (cnt == 2) {
        return p;
      }
    }
  }
}
