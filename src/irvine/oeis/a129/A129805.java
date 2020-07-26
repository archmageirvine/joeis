package irvine.oeis.a129;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A129805 Primes congruent to <code>+-1 mod 18</code>.
 * @author Sean Irvine
 */
public class A129805 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(18);
      if (r == 1 || r == 17) {
        return p;
      }
    }
  }
}
