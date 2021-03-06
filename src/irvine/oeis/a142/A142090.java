package irvine.oeis.a142;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A142090 Primes congruent to 22 mod 35.
 * @author Sean A. Irvine
 */
public class A142090 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(35);
      if (r == 22) {
        return p;
      }
    }
  }
}
