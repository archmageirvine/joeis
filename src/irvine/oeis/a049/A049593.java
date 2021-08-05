package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049593 Primes p for which residue of ((p-1)! + 1) modulo (p + 16) equals 1.
 * @author Sean A. Irvine
 */
public class A049593 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z mod = p.add(16);
      Z f = Z.ONE;
      for (Z k = Z.TWO; k.compareTo(p) < 0; k = k.add(1)) {
        f = f.modMultiply(k, mod);
        if (f.isZero()) {
          return p;
        }
      }
    }
  }
}

