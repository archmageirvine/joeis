package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A068410 Numbers k such that k+1 is composite and divides 3^k-2^k.
 * @author Sean A. Irvine
 */
public class A068410 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z k1 = super.next();
      final Z k = k1.subtract(1);
      if (Z.THREE.modPow(k, k1).subtract(Z.TWO.modPow(k, k1)).mod(k1).isZero()) {
        return k;
      }
    }
  }
}

