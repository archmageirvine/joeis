package irvine.oeis.a045;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A045354 Primes congruent to <code>{0, 2, 5, 6} mod 7</code>.
 * @author Sean Irvine
 */
public class A045354 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(7);
      if (r == 0 || r == 2 || r == 5 || r == 6) {
        return p;
      }
    }
  }
}
