package irvine.oeis.a142;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A142225 Primes congruent to 28 mod 41.
 * @author Sean A. Irvine
 */
public class A142225 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(41);
      if (r == 28) {
        return p;
      }
    }
  }
}
