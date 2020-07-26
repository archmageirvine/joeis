package irvine.oeis.a215;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A215162 Primes congruent to <code>{2, 3, 5, 7, 11} mod 19</code>.
 * @author Sean Irvine
 */
public class A215162 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(19);
      if (r == 2 || r == 3 || r == 5 || r == 7 || r == 11) {
        return p;
      }
    }
  }
}
