package irvine.oeis.a045;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A045402 Primes congruent to <code>{1, 3, 4, 5, 6} mod 7</code>.
 * @author Sean Irvine
 */
public class A045402 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(7);
      if (r == 1 || r == 3 || r == 4 || r == 5 || r == 6) {
        return p;
      }
    }
  }
}
