package irvine.oeis.a142;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A142526 Primes congruent to 41 mod 52.
 * @author Sean A. Irvine
 */
public class A142526 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(52);
      if (r == 41) {
        return p;
      }
    }
  }
}
