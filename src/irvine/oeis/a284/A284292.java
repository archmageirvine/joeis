package irvine.oeis.a284;
// Generated by gen_seq4.pl 2024-03-14g/filter at 2024-03-14 21:15

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A284292 Primes containing a digit 8.
 * @author Georg Fischer
 */
public class A284292 extends FilterSequence {

  /** Construct the sequence. */
  public A284292() {
    super(1, new A000040(), v -> v.toString().indexOf('8') >= 0);
  }
}
