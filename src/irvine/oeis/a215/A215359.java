package irvine.oeis.a215;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A215359 Primes congruent to <code>{0, 2, 3, 4} mod 13</code>.
 * @author Sean Irvine
 */
public class A215359 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(13);
      if (r == 0 || r == 2 || r == 3 || r == 4) {
        return p;
      }
    }
  }
}
