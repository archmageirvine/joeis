package irvine.oeis.a045;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A045387 Primes congruent to {2, 4} mod 7.
 * @author Sean A. Irvine
 */
public class A045387 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(7);
      if (r == 2 || r == 4) {
        return p;
      }
    }
  }
}
