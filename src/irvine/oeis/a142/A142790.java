package irvine.oeis.a142;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A142790 Primes congruent to <code>23 mod 60</code>.
 * @author Sean Irvine
 */
public class A142790 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(60);
      if (r == 23) {
        return p;
      }
    }
  }
}
