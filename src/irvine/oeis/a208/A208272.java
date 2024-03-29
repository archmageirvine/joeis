package irvine.oeis.a208;
// Generated by gen_seq4.pl 2024-03-14g/filter at 2024-03-14 21:15

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A208272 Primes containing a digit 2.
 * @author Georg Fischer
 */
public class A208272 extends FilterSequence {

  /** Construct the sequence. */
  public A208272() {
    super(1, new A000040(), v -> v.toString().indexOf('2') >= 0);
  }
}
