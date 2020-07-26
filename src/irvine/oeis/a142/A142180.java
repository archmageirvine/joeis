package irvine.oeis.a142;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A142180 Primes congruent to <code>35 mod 39</code>.
 * @author Sean Irvine
 */
public class A142180 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(39);
      if (r == 35) {
        return p;
      }
    }
  }
}
