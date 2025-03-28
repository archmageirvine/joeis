package irvine.oeis.a090;
// Generated by gen_seq4.pl 2024-12-23.ack/filter at 2024-12-23 23:24

import irvine.oeis.FilterSequence;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A090151 Primes of the form identical digits preceded by a 3.
 * @author Georg Fischer
 */
public class A090151 extends FilterSequence {

  /** Construct the sequence. */
  public A090151() {
    super(1, new MultiTransformSequence(1, (self, n) -> {
      final long m = self.a(n - 2).mod(10);
      return self.a(n - 2).multiply(10).add(m);
    }, "3, 31, 37"), PRIME);
  }
}
