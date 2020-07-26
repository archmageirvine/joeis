package irvine.oeis.a214;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A214889 Primes congruent to <code>{2, 3} mod 13</code>.
 * @author Sean Irvine
 */
public class A214889 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(13);
      if (r == 2 || r == 3) {
        return p;
      }
    }
  }
}
