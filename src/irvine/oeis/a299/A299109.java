package irvine.oeis.a299;
// Generated by gen_seq4.pl filterm/filter at 2023-09-11 18:58

import irvine.oeis.FilterSequence;
import irvine.oeis.a030.A030221;

/**
 * A299109 Probable primes in A030221.
 * @author Georg Fischer
 */
public class A299109 extends FilterSequence {

  /** Construct the sequence. */
  public A299109() {
    super(1, new A030221(), PRIME);
  }
}
