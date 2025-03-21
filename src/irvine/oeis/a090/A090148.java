package irvine.oeis.a090;
// Generated by gen_seq4.pl 2024-12-23.ack/filter at 2024-12-23 23:24

import irvine.oeis.FilterSequence;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A090148 Primes of the form identical digits followed by a 9.
 * @author Georg Fischer
 */
public class A090148 extends FilterSequence {

  /** Construct the sequence. */
  public A090148() {
    super(1, new MultiTransformSequence(1, (self, n) -> {
      final long m = self.a(n - 9).mod(100);
      return self.a(n - 9).subtract(m % 10).multiply(10).add(m);
    }, "9, 19, 29, 39, 49, 59, 69, 79, 89, 99"), PRIME);
  }
}
