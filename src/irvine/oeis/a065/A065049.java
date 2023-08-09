package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065049 Odd primes of incorrect parity: number of 1's in the binary representation of n (mod 2) == 1 - (n mod 3) (mod 2). Also called isolated primes.
 * @author Sean A. Irvine
 */
public class A065049 extends A000040 {

  {
    super.next(); // skip 2
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if ((p.bitCount() & 1) != (p.mod(3) & 1)) {
        return p;
      }
    }
  }
}

