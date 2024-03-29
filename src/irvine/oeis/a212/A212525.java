package irvine.oeis.a212;
// Generated by gen_seq4.pl 2024-03-14g/filter at 2024-03-14 21:15

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A212525 Primes containing a digit 3.
 * @author Georg Fischer
 */
public class A212525 extends FilterSequence {

  /** Construct the sequence. */
  public A212525() {
    super(1, new A000040(), v -> v.toString().indexOf('3') >= 0);
  }
}
