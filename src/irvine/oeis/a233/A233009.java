package irvine.oeis.a233;
// Generated by gen_seq4.pl dersimple at 2021-08-25 22:45

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;

/**
 * A233009 Exponents p of the Mersenne primes 2^p - 1 (see A000043) read mod 23.
 * @author Georg Fischer
 */
public class A233009 extends A000043 {

  @Override
  public Z next() {
    return super.next().mod(Z.valueOf(23));
  }
}
