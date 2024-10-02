package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072439 Primes prime(k) such that the number of binary 1's in prime(k) equals the number of binary 1's in k.
 * @author Sean A. Irvine
 */
public class A072439 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.bitCount() == Long.bitCount(++mN)) {
        return p;
      }
    }
  }
}

