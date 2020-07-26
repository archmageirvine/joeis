package irvine.oeis.a045;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A045422 Primes congruent to <code>{0, 1, 3, 6} mod 7</code>.
 * @author Sean Irvine
 */
public class A045422 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(7);
      if (r == 0 || r == 1 || r == 3 || r == 6) {
        return p;
      }
    }
  }
}
