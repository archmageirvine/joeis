package irvine.oeis.a138;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-27 22:03

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a058.A058341;

/**
 * A138539 Primes p_n for which A140141(n) &lt; 2p_n, where p_n = n-th prime (A000040).
 * @author Georg Fischer
 */
public class A138539 extends PrependSequence {

  /** Construct the sequence. */
  public A138539() {
    super(1, new A058341() {
      @Override
      public Z next() {
        return super.next();
      }
    }, 2);
  }
}
