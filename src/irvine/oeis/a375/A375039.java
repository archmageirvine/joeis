package irvine.oeis.a375;
// Generated by gen_seq4.pl 2025-05-08.ack/filter at 2025-05-08 13:52

import irvine.oeis.FilterSequence;
import irvine.oeis.a051.A051903;

/**
 * A375039 The maximum exponent in the prime factorization of 2*n-1.
 * @author Georg Fischer
 */
public class A375039 extends FilterSequence {

  /** Construct the sequence. */
  public A375039() {
    super(1, new A051903(), (n, v) -> (n & 1) == 1);
  }
}
