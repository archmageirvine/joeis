package irvine.oeis.a343;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000668;

/**
 * A343733 Primes p at which tau(p^p) is a prime power, where tau is the number-of-divisors function A000005.
 * @author Georg Fischer
 */
public class A343733 extends PrependSequence {

  /** Construct the sequence. */
  public A343733() {
    super(1, new A000668() {
      @Override
      public Z next() {
        return super.next();
      }
    }, 2);
  }
}
