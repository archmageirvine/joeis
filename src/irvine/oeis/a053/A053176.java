package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A053176 Primes p such that 2p+1 is composite.
 * @author Sean A. Irvine
 */
public class A053176 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!p.multiply2().add(1).isProbablePrime()) {
        return p;
      }
    }
  }
}

