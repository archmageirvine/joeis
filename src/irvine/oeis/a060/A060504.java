package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A060504 Let p be a prime that has a primitive root between 0 and p that is not also a primitive root of p^2 (A060503); sequence gives smallest such primitive root.
 * @author Sean A. Irvine
 */
public class A060504 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z pp = p.square();
      for (Z k = Z.ONE; k.compareTo(p) < 0; k = k.add(1)) {
        if (ZUtils.isPrimitiveRoot(k, p) && !ZUtils.isPrimitiveRoot(k, pp)) {
          return k;
        }
      }
    }
  }
}
