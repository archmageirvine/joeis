package irvine.oeis.a215;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A215372 Primes congruent to <code>{0, 2, 3, 5, 6} mod 17</code>.
 * @author Sean Irvine
 */
public class A215372 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(17);
      if (r == 0 || r == 2 || r == 3 || r == 5 || r == 6) {
        return p;
      }
    }
  }
}
