package irvine.oeis.a127;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A127578 Primes congruent to 31 mod 32.
 * @author Sean A. Irvine
 */
public class A127578 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(32);
      if (r == 31) {
        return p;
      }
    }
  }
}
