package irvine.oeis.a142;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A142082 Primes congruent to <code>9 mod 35</code>.
 * @author Sean Irvine
 */
public class A142082 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(35);
      if (r == 9) {
        return p;
      }
    }
  }
}
