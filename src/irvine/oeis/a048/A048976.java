package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A048976 Primes whose least primitive root is an odd prime.
 * @author Sean A. Irvine
 */
public class A048976 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = ZUtils.leastPrimitiveRoot(p);
      if (q.isOdd() && q.isProbablePrime()) {
        return p;
      }
    }
  }
}

